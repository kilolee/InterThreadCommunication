package l_one_producer_customers_wait_dead;


/**
 * Created by kilo on 2019/7/10.
 */
public class Consumer {
    private MyStack myStack;

    public Consumer(MyStack myStack) {
        super();
        this.myStack = myStack;
    }

    public void popService() {
        System.out.println("pop=" + myStack.pop());
    }
}
