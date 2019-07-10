package wait_and_notify.k_one_producer_customer.operand_stack;

/**
 * Created by kilo on 2019/7/10.
 */
public class ThreadC extends Thread {
    private Consumer consumer;

    public ThreadC(Consumer consumer) {
        super();
        this.consumer = consumer;
    }

    @Override
    public void run() {
        while (true) {
            consumer.popService();
        }
    }
}
