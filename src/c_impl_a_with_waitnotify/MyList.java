package c_impl_a_with_waitnotify;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kilo on 2019/7/8.
 */
public class MyList {
    private static List list = new ArrayList();

    public static void add() {
        list.add("anyString");
    }

    public static int size() {
        return list.size();
    }
}
