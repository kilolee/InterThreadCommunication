package b_simplewaitnotify;

/**
 * Created by kilo on 2019/7/8.
 */
public class Thread1 extends Thread {
    private Object lock;

    public Thread1(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                System.out.println("开始wait time=" + System.currentTimeMillis());
                lock.wait();
                System.out.println("结束wait time=" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
