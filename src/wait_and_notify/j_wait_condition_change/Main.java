package wait_and_notify.j_wait_condition_change;

/**
 * 等待wait的条件发生变化
 * Created by kilo on 2019/7/9.
 */
public class Main {
    public static void main(String[] args) {

        try {
            String lock = new String("");

            Add add = new Add(lock);
            Subtract subtract = new Subtract(lock);

            ThreadSubtract subtract1Thread = new ThreadSubtract(subtract);
            subtract1Thread.setName("subtract1Thread");
            subtract1Thread.start();

            ThreadSubtract subtract2Thread = new ThreadSubtract(subtract);
            subtract2Thread.setName("subtract2Thread");
            subtract2Thread.start();

            Thread.sleep(1000);

            ThreadAdd addThread = new ThreadAdd(add);
            addThread.setName("addThread");
            addThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
