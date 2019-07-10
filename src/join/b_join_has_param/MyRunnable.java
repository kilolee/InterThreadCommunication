package join.b_join_has_param;

/**
 * Created by kilo on 2019/7/11.
 */
public class MyRunnable {

    static private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            try {
                System.out.println("begin Timer=" + System.currentTimeMillis());
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    public static void main(String[] args) {
        try {
            Thread thread = new Thread(runnable);
            thread.start();
            thread.join(2000);
//            Thread.sleep(2000);
            System.out.println("  end timer=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
