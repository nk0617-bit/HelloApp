public class HelloApp {

    public static void main(String[] args) {
        // Check if any command-line arguments were provided
        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();

            // 1. Enhanced For Loop: Iterate through all provided names
            for (String name : args) {
                // Append the name and a trailing delimiter (comma and space)
                nameBuilder.append(name).append(", ");
            }

            // 2. String Manipulation: Convert StringBuilder to String 
            String namesList = nameBuilder.toString();

            // 3. Trailing Character Removal: Use substring to remove the last ", "
            // The length - 2 accounts for the extra comma and space at the end
            if (namesList.length() > 0) {
                namesList = namesList.substring(0, namesList.length() - 2);
            }

            // Display the personalized greeting
            System.out.println("Hello, " + namesList + "!");
        } else {
            // 4. Default Case: If no names are provided
            System.out.println("Hello, World!");
        }
    }
}
