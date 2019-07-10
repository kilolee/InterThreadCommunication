package wait_and_notify.i_first_notify;

/**
 * 通知过早,会打乱程序正常的运行逻辑
 * Created by kilo on 2019/7/9.
 */
public class MyRun {
    static private Object lock = new Object();
    static private Runnable waitThread = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("wait begin timer="
                            + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("wait   end timer="
                            + System.currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    static private Runnable notifyThread = new Runnable() {
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println("notify begin timer="
                        + System.currentTimeMillis());
                lock.notify();
                System.out.println("notify   end timer="
                        + System.currentTimeMillis());
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        Thread wait = new Thread(waitThread);
        wait.start();

        Thread.sleep(100);

        Thread notify = new Thread(notifyThread);
        notify.start();
    }


}
