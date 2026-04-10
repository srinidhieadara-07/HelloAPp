public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        for (String name : args) {
            if (name == null) {
                continue;
            }
            name = name.trim();
            if (name.isEmpty()) {
                continue;
            }
            System.out.println("Hello, " + name + "!");
        }
    }
}