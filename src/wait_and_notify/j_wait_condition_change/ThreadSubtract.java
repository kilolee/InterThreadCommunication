package wait_and_notify.j_wait_condition_change;

/**
 * 减法线程
 * Created by kilo on 2019/7/9.
 */
public class ThreadSubtract extends Thread {
    private Subtract r;

    public ThreadSubtract(Subtract r) {
        super();
        this.r = r;
    }

    @Override
    public void run() {
        r.subtract();
    }
}
