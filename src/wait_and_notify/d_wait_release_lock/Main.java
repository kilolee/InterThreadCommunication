package wait_and_notify.d_wait_release_lock;

/**
 * wait()执行过后立即释放锁
 * Created by kilo on 2019/7/8.
 */
public class Main {
    public static void main(String[] args) {
        Object lock = new Object();

        ThreadA a = new ThreadA(lock);
        a.start();

        ThreadB b = new ThreadB(lock);
        b.start();
    }
}
