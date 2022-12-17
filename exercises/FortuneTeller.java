import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {
        System.out.println("Pick a number betweem 1 and 10");
        Scanner scanner = new Scanner(System.in);
        int inputtedNum = scanner.nextInt();
        if (inputtedNum < 5) {
            System.out.println("Good luck");
        } else {
            System.out.println("Happiness");
        }
    }
}