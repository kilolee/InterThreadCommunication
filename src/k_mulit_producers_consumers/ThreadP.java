package k_mulit_producers_consumers;

/**
 * Created by kilo on 2019/7/9.
 */
public class ThreadP extends Thread {
    private Producer producer;

    public ThreadP(Producer producer) {
        super();
        this.producer = producer;
    }

    @Override
    public void run() {
        while (true) {
            producer.product();
        }
    }
}
