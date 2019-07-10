package wait_and_notify.f_interrupt_wait;


/**
 * 呈wait状态的线程被interrupt
 * 线程遇到异常而导致线程终止，锁也会被释放
 * Created by kilo on 2019/7/8.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Object lock = new Object();

            ThreadA a = new ThreadA(lock);
            a.start();
            Thread.sleep(5000);

            //中断a线程
            a.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
