package helloapp;
public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.print("Hello ");
            for (String arg : args) {
                System.out.print(arg + " ");
            }
        } else {
            System.out.println("Hello");
        }
    }
}
