package wait_and_notify.j_wait_condition_change;

/**
 * 减少数据
 * Created by kilo on 2019/7/9.
 */
public class Subtract {
    private String lock;

    public Subtract(String lock) {
        super();
        this.lock = lock;
    }

    public void subtract() {
        try {
            synchronized (lock) {

                if (ValueObject.list.size() == 0) {
                    System.out.println("wait begin ThreadName="
                            + Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("wait   end ThreadName="
                            + Thread.currentThread().getName());
                }
                ValueObject.list.remove(0);
                System.out.println("list size=" + ValueObject.list.size());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
