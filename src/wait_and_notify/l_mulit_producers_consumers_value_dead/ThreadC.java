package wait_and_notify.l_mulit_producers_consumers_value_dead;

/**
 * Created by kilo on 2019/7/9.
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
            consumer.comsume();
        }
    }
}
