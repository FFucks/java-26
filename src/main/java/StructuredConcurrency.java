import java.util.concurrent.StructuredTaskScope;

public class StructuredConcurrency {

    public static void run() throws Exception {
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {

            var task1 = scope.fork(() -> fetchUser());
            var task2 = scope.fork(() -> fetchOrder());

            scope.join();
            scope.throwIfFailed();

            System.out.println(task1.get() + " - " + task2.get());
        }
    }

    static String fetchUser() {
        return "User";
    }

    static String fetchOrder() {
        return "Order";
    }
}
