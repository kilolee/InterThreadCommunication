package wait_and_notify.l_one_producer_customers_wait_dead;

/**
 * Created by kilo on 2019/7/11.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyStack myStack = new MyStack();

        Producer producer = new Producer(myStack);

        Consumer r1 = new Consumer(myStack);
        Consumer r2 = new Consumer(myStack);
        Consumer r3 = new Consumer(myStack);
        Consumer r4 = new Consumer(myStack);
        Consumer r5 = new Consumer(myStack);

        ThreadP pThread = new ThreadP(producer);
        pThread.start();

        ThreadC cThread1 = new ThreadC(r1);
        ThreadC cThread2 = new ThreadC(r2);
        ThreadC cThread3 = new ThreadC(r3);
        ThreadC cThread4 = new ThreadC(r4);
        ThreadC cThread5 = new ThreadC(r5);
        cThread1.start();
        cThread2.start();
        cThread3.start();
        cThread4.start();
        cThread5.start();
    }
}
