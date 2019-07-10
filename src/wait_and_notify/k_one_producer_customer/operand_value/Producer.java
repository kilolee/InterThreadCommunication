package wait_and_notify.k_one_producer_customer.operand_value;


/**
 * Created by kilo on 2019/7/10.
 */
public class Producer {
    private String lock;

    public Producer(String lock) {
        super();
        this.lock = lock;
    }

    public void product() {
        try {
            synchronized (lock) {
                while (!"".equals(ValueObject.getValue())) {
//                    System.out.println("生产者 "
//                            + Thread.currentThread().getName() + " WAITING了★");
                    lock.wait();
                }
//                System.out.println("生产者 " + Thread.currentThread().getName()
//                        + " RUNNABLE了");
                String value = System.currentTimeMillis() + "_"
                        + System.nanoTime();
                System.out.println("set 的值是 "+value);
                ValueObject.setValue(value);
                lock.notify();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
