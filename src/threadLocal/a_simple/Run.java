package threadLocal.a_simple;

/**
 * simple案例t1
 * 在ThreadLocalExt中重写ThreadLocal的初始值t2
 * Created by kilo on 2019/7/11.
 */
public class Run {
    public static ThreadLocal tl = new ThreadLocal();
    public static ThreadLocalExt t2 = new ThreadLocalExt();

    public static void main(String[] args) {
        if (tl.get() == null) {
            System.out.println("从未放过值");
            tl.set("我的值");
//            t2.set("我改写的初始值");
        }
        System.out.println(tl.get());

//        System.out.println(t2.get());
    }
}
