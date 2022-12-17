import java.util.Scanner;

public class MultipleChoice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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

        if (capitalisedInput.equals(correctAnswer)) {
            System.out.println("Congrats! The answer is correct!");
        } else {
            System.out.println("The answer was incorrect. The correct answer is" + " " + correctAnswer + ".");
        }

    }
}
