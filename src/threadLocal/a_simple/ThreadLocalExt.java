package threadLocal.a_simple;

/**
 * 重写初始值
 * Created by kilo on 2019/7/11.
 */
public class ThreadLocalExt extends ThreadLocal {

    @Override
    protected Object initialValue() {
        return "改写初始值，第一次get不再为null";
    }
}
