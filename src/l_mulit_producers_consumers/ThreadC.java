package l_mulit_producers_consumers;

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
