import java.util.Scanner;

public class ConcatenatingStrings {
    public static void main(String[] args) {
        double studentGPA = 3.45;
        String studentFirstName = "Edmond";
        String studentLastName = "Luu";


        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
        
        
        // If we want to allow the user to update the GPA:
        // Must import java.util.Scanner first.
        System.out.println("What do you want to update it to?");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        
        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA);
    }
}
