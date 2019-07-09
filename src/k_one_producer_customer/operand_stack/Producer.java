package k_one_producer_customer.operand_stack;

/**
 * Created by kilo on 2019/7/10.
 */
public class Producer {
    private MyStack myStack;

    public Producer(MyStack myStack) {
        super();
        this.myStack = myStack;
    }

    public void pushService() {
        myStack.push();
    }
}
