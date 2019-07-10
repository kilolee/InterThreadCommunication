package wait_and_notify.l_mulit_producers_consumers_value_dead;

/**
 * 消费者
 * Created by kilo on 2019/7/9.
 */
public class Consumer {
    private String lock;

    public Consumer(String lock) {
        super();
        this.lock = lock;
    }

    public void comsume() {
        try {
            synchronized (lock) {
                while ("".equals(ValueObject.getValue())) {
                    System.out.println("消费者 "
                            + Thread.currentThread().getName() + " WAITING了☆");
                    lock.wait();
                }
                System.out.println("消费者 " + Thread.currentThread().getName()
                        + " RUNNABLE了");
                ValueObject.setValue("");
                lock.notify();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
