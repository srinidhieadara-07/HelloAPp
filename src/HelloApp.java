public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        String names = String.join(", ", args);

        if (names.trim().isEmpty()) {
            System.out.println("Hello, World!");
            return;
        }

        System.out.println("Hello, " + names + "!");
    }
}
