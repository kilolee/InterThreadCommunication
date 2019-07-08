package g_notify_one_all;

public class Service {

    public void waitMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait() ThreadName=" + ThreadA.currentThread().getName() + " time="
                        + System.currentTimeMillis());
                lock.wait();
                System.out.println("  end wait() ThreadName=" + ThreadA.currentThread().getName() + " time="
                        + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("出现异常了，因为呈wait状态的线程被interrupt了！");
        }
    }


    public void synNotifyMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin notify() ThreadName = "
                        + ThreadA.currentThread().getName() + " time="
                        + System.currentTimeMillis());
                lock.notify();
                ThreadA.sleep(5000);
                System.out.println("  end notify() ThreadName = "
                        + ThreadA.currentThread().getName() + " time="
                        + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
