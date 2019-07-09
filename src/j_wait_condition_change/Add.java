package j_wait_condition_change;

/**
 * 添加数据
 * Created by kilo on 2019/7/9.
 */
public class Add {
    private String lock;

    public Add(String lock) {
        super();
        this.lock = lock;
    }

    public void add() {
        synchronized (lock) {
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }
}
