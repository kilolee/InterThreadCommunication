package k_mulit_producers_consumers;

/**
 * 加斯
 * Created by kilo on 2019/7/9.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        String lock = new String("");
        Producer producer = new Producer(lock);
        Consumer consumer = new Consumer(lock);

        ThreadP[] pThread = new ThreadP[2];
        ThreadC[] cThread = new ThreadC[2];

        for (int i = 0; i < 2; i++) {
            pThread[i] = new ThreadP(producer);
            pThread[i].setName("生产者" + (i + 1));

            cThread[i] = new ThreadC(consumer);
            cThread[i].setName("消费者" + (i + 1));

            pThread[i].start();
            cThread[i].start();
        }

        Thread.sleep(5000);
        Thread[] threadArray = new Thread[Thread.currentThread()
                .getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadArray);

        for (int i = 0; i < threadArray.length; i++) {
            System.out.println(threadArray[i].getName() + " "
                    + threadArray[i].getState());
        }
    }
}
