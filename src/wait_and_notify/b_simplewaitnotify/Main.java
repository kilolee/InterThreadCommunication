package wait_and_notify.b_simplewaitnotify;

/**
 * use wait() and notify()
 * 使用等待/通知机制实现的简单的线程间通信
 * Created by kilo on 2019/7/8.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Object lock = new Object();

            Thread1 t1 = new Thread1(lock);
            t1.start();

            Thread.sleep(3000);

            Thread2 t2 = new Thread2(lock);
            t2.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
