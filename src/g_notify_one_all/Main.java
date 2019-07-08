package g_notify_one_all;


/**
 * 调用notify()一次只随机通知一个线程进行唤醒
 * Created by kilo on 2019/7/8.
 */
public class Main {
    public static void main(String[] args) {


        try {
            Object lock = new Object();

            ThreadA a = new ThreadA(lock);
            a.start();
            ThreadA b = new ThreadA(lock);
            b.start();
            ThreadA c = new ThreadA(lock);
            c.start();

            Thread.sleep(1000);

            NotifyThread notifyThread = new NotifyThread(lock);
            notifyThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
