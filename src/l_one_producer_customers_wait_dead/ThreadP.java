package l_one_producer_customers_wait_dead;

/**
 * Created by kilo on 2019/7/10.
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
            producer.pushService();
        }
    }
}
