import java.util.Scanner;

public class Functions {
    // Functions are defined OUTSIDE of the main function
    public static void functionName() {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type in a random word and press Enter to start eveloper tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time!");
    }

    public static void main(String[] args) {
        functionName();
    }

}