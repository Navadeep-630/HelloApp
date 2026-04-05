package helloapp;
public class HelloApp {
    public static void main(String[] args) {
        
        // Check if arguments are passed
        if (args.length > 0) {
            // Enhanced for loop to iterate through arguments
            for (String name : args) {
                System.out.println("Hello " + name);
            }
        } else {
            // Default message if no arguments are passed
            System.out.println("Hello User");
        }
    }
}