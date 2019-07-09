package k_one_producer_customer.operand_stack;

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
