public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }
        String names = "";
        for (String name : args) {
            if (name == null) {
                continue;
            }
            name = name.trim();
            if (name.isEmpty()) {
                continue;
            }
            names += name + ", ";
        }
        if (names.isEmpty()) {
            System.out.println("Hello, World!");
            return;
        }
        names = names.substring(0, names.length() - 2);
        System.out.println("Hello, " + names + "!");
    }
}