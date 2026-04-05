package helloapp;
public class HelloApp {
    public static void main(String[] args) {

        if (args.length > 0) {
            String result = "";

            // Build string with delimiter (comma + space)
            for (String name : args) {
                result += name + ", ";
            }

            // Remove trailing ", " using substring
            result = result.substring(0, result.length() - 2);

            // Display final message
            System.out.println("Hello " + result);
        } else {
            // Default message
            System.out.println("Hello User");
        }
    }
}
