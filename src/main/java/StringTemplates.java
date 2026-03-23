import static java.lang.StringTemplate.STR;

public class StringTemplates {

    public static void run() {
        String name = "Fábio";
        String lastName = "Fucks";

        String result = STR."My name is \{name} and my last name is \{lastName}.";

        System.out.println(result);
    }
}
