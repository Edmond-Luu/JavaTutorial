import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while (isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("Stop repeating?");
            String userInput = input.next();

            if (userInput.equals("yes")) {
                isOnRepeat = false;
            }
        }
        System.out.println("Playing next song.");
    }
}
