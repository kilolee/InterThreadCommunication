package wait_and_notify.k_one_producer_customer.operand_stack;

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
