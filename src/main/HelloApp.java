public class HelloApp {
        public static void main(String[] args) {
        String names;
        if (args.length == 0) {
            names = "World";
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            names = nameBuilder.toString();
        }
        System.out.println("Hello, " + names + "!");
    }
}