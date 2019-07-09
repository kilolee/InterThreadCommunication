package l_mulit_producers_consumers;

/**
 * 只存储一个字符串
 * Created by kilo on 2019/7/9.
 */
public class ValueObject {
    private static String value = "";

    public static String getValue() {
        return value;
    }

    public static void setValue(String value) {
        ValueObject.value = value;
    }
}
