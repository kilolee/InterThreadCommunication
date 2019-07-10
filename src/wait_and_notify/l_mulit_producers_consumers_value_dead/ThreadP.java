package wait_and_notify.l_mulit_producers_consumers_value_dead;

/**
 * Created by kilo on 2019/7/9.
 */
public class ThreadP extends Thread {
    private Producer producer;

    public ThreadP(Producer producer) {
        super();
        this.producer = producer;
    }

    @Override
    public void run() {
        while (true) {
            producer.product();
        }
    }
}
