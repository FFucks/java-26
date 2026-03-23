
public class UnnamedPatterns {

    public static void run(Object obj) {
        if (obj instanceof String _) {
            System.out.println("It is a String, but I do not need the variable");
        }
    }
}
