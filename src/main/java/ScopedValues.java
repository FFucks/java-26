import java.lang.ScopedValue;

public class ScopedValues {

    private static final ScopedValue<String> USER = ScopedValue.newInstance();

    public static void run() {
        ScopedValue.where(USER, "fabio").run(() -> {
            process();
        });
    }


    private static void process() {
        System.out.println("Actual User: " + USER.get());
    }
}
