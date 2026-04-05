package helloapp;
public class HelloApp {
    public static void main(String[] args) {

        if (args.length > 0) {
            String result = "Hello ";

            // Build the string using String concatenation
            for (int i = 0; i < args.length; i++) {
                result += args[i];

                // Add comma separator except for last element
                if (i < args.length - 1) {
                    result += ", ";
                }
            }

            // Print final result
            System.out.println(result);
        } else {
            // Default message
            System.out.println("Hello User");
        }
    }
}