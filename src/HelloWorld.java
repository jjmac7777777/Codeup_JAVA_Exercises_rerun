public class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Hello World");
        System.out.print("Hello World");
    }
}

//Error: Main method not found in class HelloWorld, please define the main method as:
//   public static void main(String[] args)
//or a JavaFX application class must extend javafx.application.Application (Changed main method...result!)
//Changed back to MAIN...program ran successfully!!!