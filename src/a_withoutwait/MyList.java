package a_withoutwait;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kilo on 2019/7/8.
 */
public class MyList {
    private List list = new ArrayList();

    public void add() {
        list.add("anyString");
    }

    public int size() {
        return list.size();
    }
}
