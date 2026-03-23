public class Application {

    public static void main(String[] args) throws Exception {

        System.out.println("=== String Templates ===");
        StringTemplates.run();

        System.out.println("\n=== Scoped Values ===");
        ScopedValues.run();

        System.out.println("\n=== Structured Concurrency ===");
        StructuredConcurrency.run();

        System.out.println("\n=== Unnamed Patterns ===");
        UnnamedPatterns.run("test");

        System.out.println("\n=== Primitive Patterns ===");
        PrimitiveTypesPatterns.run(10);
    }
}
