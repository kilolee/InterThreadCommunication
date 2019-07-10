package wait_and_notify.a_withoutwait;

/**
 * Created by kilo on 2019/7/8.
 */
public class Main {

    /**
     * without use wait() and notify()
     * 不使用等待/通知机制实现线程间通信
     *
     * @param args
     */
    public static void main(String[] args) {
        MyList list = new MyList();

        ThreadA a = new ThreadA(list);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(list);
        b.setName("B");
        b.start();

    }
}
