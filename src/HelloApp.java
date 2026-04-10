public class HelloApp {
    public static void main(String[] args) {
        if (args.length >= 1 && args[0] != null && !args[0].trim().isEmpty()) {
            System.out.println("Hello " + args[0].trim());
        } else {
            System.out.println("Hello World");
        }
    }
}