package wait_and_notify.g_notify_one_all;


/**
 * Created by kilo on 2019/7/8.
 */
public class ThreadA extends java.lang.Thread {
    private Object lock;

    public ThreadA(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.waitMethod(lock);
    }
}
