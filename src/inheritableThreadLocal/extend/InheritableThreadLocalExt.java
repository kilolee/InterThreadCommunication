package inheritableThreadLocal.extend;


import java.util.Date;

/**
 * 修改初始值
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

    /**
     * 继承再修改
     * @param parentValue
     * @return
     */
    @Override
    protected Object childValue(Object parentValue) {
        return parentValue + "我在线程加的";
    }
}
