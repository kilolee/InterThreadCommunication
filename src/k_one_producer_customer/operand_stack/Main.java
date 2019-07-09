package k_one_producer_customer.operand_stack;

/**
 * 一生产者、一消费者  操作栈方式
 * Created by kilo on 2019/7/10.
 */
public class Main {
    public static void main(String[] args) {


        try {
            MyStack myStack = new MyStack();

            Producer p = new Producer(myStack);
            ThreadP pThread = new ThreadP(p);
            pThread.start();

            Thread.sleep(100);

            Consumer r = new Consumer(myStack);
            ThreadC rThread = new ThreadC(r);
            rThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
