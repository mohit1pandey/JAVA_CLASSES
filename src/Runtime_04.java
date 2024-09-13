public class Runtime_04 {

    public static void main(String[] args) {
        // Get the Runtime instance
        Runtime runtime = Runtime.getRuntime();

        // Print initial memory usage
        System.out.println("Initial free memory: " + runtime.freeMemory());
        System.out.println("Initial total memory: " + runtime.totalMemory());

        // Create a simple array to use some memory
        int[] largeArray = new int[1000000];

        // Print memory usage after creating the array
        System.out.println("Free memory after allocating array: " + runtime.freeMemory());
        System.out.println("Total memory after allocating array: " + runtime.totalMemory());

        // Suggest garbage collection
        runtime.gc();

        // Print memory usage after suggesting garbage collection
        System.out.println("Free memory after garbage collection: " + runtime.freeMemory());
        System.out.println("Total memory after garbage collection: " + runtime.totalMemory());

        // Execute a simple command using exec()
        try {
            Process process = runtime.exec("echo Hello, World!");
            process.waitFor(); // Wait for the process to complete
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Add a shutdown hook
        runtime.addShutdownHook(new Thread(() -> System.out.println("JVM is shutting down...")));

        // Print system properties
        System.out.println("Java version: " + System.getProperty("java.version"));

        // Call exit to terminate the JVM (for demonstration purposes, use with caution)
        // runtime.exit(0);
    }

}
