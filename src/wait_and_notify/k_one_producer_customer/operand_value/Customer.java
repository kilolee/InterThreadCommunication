package wait_and_notify.k_one_producer_customer.operand_value;

/**
 * Created by kilo on 2019/7/10.
 */
public class Customer {
    private String lock;

    public Customer(String lock) {
        super();
        this.lock = lock;
    }

    public void customer() {
        try {
            synchronized (lock) {
                if ("".equals(ValueObject.getValue())) {
//                    System.out.println("消费者 "
//                            + MyRunnable.currentThread().getName() + " WAITING了☆");
                    lock.wait();
                }
//                System.out.println("消费者 " + MyRunnable.currentThread().getName()
//                        + " RUNNABLE了");
                System.out.println("get 的值是 "+ValueObject.getValue());
                ValueObject.setValue("");
                lock.notify();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
