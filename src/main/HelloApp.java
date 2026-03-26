public class HelloApp {

    public static void main(String[] args) {
        String namesOutput;
        if (args.length == 0) {
            namesOutput = "World";
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;
            for (String name : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                
                nameBuilder.append(name);
                first = false;
            }
            namesOutput = nameBuilder.toString();
        }
        System.out.println("Hello, " + namesOutput + "!");
    }
}
