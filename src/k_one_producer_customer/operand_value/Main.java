package k_one_producer_customer.operand_value;

/**
 * 一生产者、一消费者  操作值方式
 * Created by kilo on 2019/7/10.
 */
public class Main {
    public static void main(String[] args) {
        try {
            String lock = new String("");
            Producer producer = new Producer(lock);
            ThreadP pThread = new ThreadP(producer);

            pThread.start();

            Thread.sleep(100);

            Customer customer = new Customer(lock);
            ThreadC rThread = new ThreadC(customer);
            rThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
