package wait_and_notify.k_one_producer_customer.operand_value;

/**
 * Created by kilo on 2019/7/10.
 */
public class ThreadC extends Thread {
    private Customer customer;

    public ThreadC(Customer customer) {
        super();
        this.customer = customer;
    }

    @Override
    public void run() {
        while (true) {
            customer.customer();
        }
    }
}
