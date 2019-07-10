package wait_and_notify.b_simplewaitnotify;

/**
 * only use wait()
 * Created by kilo on 2019/7/8.
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            String newString = new String("");
            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
