package wait_and_notify.b_simplewaitnotify;

/**
 * Created by kilo on 2019/7/8.
 */
public class Thread2 extends Thread {
    private Object lock;

    public Thread2(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("开始notify time=" + System.currentTimeMillis());
            lock.notify();
            System.out.println("结束notify time=" + System.currentTimeMillis());
        }
    }
}
