public class PrimitiveTypesPatterns {

    public static void run(Object obj) {

        if (obj instanceof Integer i) {
            System.out.println("Integer: " + i);
        }

        if (obj instanceof Double d) {
            System.out.println("Double: " + d);
        }
    }
}
