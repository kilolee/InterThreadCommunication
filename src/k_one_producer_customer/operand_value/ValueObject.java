package k_one_producer_customer.operand_value;

/**
 * 只存储一个字符串
 * Created by kilo on 2019/7/10.
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
