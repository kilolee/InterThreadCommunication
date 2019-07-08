package d_wait_release_lock;

public class Service {

    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait() " + System.currentTimeMillis());
                lock.wait();
                System.out.println("  end wait()" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
