package e_notify_hold_lock;

/**
 * Created by kilo on 2019/7/8.
 */
public class ThreadA extends Thread {
    private Object lock;

    public ThreadA(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service  service = new Service();
        service.testMethod(lock);
    }
}
