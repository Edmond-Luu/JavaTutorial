import java.util.Scanner;

public class MultipleChoice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Boolean repeat = true;

        String question = "Which of these LoL champions did NOT appear in the Arcane TV series?";
        String choiceOne = "Viktor";
        String choiceTwo = "Jayce";
        String choiceThree = "Teemo";
        String choiceFour = "Ekko";

        String correctAnswer = choiceThree;

        System.out.println(question);
        System.out.println("Choose one of the following: " + choiceOne + ", " + choiceTwo + ", " + choiceThree + ", "
                + choiceFour + ".");

        String userInput = input.next();
        String capitalisedInput = userInput.substring(0, 1).toUpperCase() + userInput.substring(1).toLowerCase();

        while (repeat) {
            if (capitalisedInput.equals(correctAnswer)) {
                System.out.println("Congrats! The answer is correct!");
                repeat = false;
            } else {
                System.out.println("The answer was incorrect. Try again");
                System.out.println("");
                System.out.println(question);
                System.out.println("Choose one of the following: " + choiceOne + ", " + choiceTwo + ", " + choiceThree + ", "
                + choiceFour + ".");
                userInput = input.next();
                capitalisedInput = userInput.substring(0, 1).toUpperCase() + userInput.substring(1).toLowerCase();
            }
        }
    }
}
