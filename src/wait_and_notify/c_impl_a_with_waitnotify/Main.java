package wait_and_notify.c_impl_a_with_waitnotify;

/**
 * Created by kilo on 2019/7/8.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Object lock = new Object();

            ThreadA a = new ThreadA(lock);
            a.start();

            Thread.sleep(50);

            ThreadB b = new ThreadB(lock);
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
