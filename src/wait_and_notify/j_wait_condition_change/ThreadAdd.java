package wait_and_notify.j_wait_condition_change;

/**
 * 加法线程
 * Created by kilo on 2019/7/9.
 */
public class ThreadAdd extends Thread {
    private Add p;

    public ThreadAdd(Add p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        p.add();
    }
}
