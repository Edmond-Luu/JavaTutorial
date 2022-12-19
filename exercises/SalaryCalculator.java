import java.util.Scanner;

public class SalaryCalculator {
    public static double calculateSalary(double hoursPerWeek, double payRate, double vacationDays) {
        double weeklySalary = hoursPerWeek * payRate;
        double yearlySalary = (weeklySalary * 52) - (vacationDays * 8 * payRate);
        return yearlySalary;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the hours worked per week: ");
        double hours = input.nextDouble();
        while (hours < 0) {
            System.out.println("Sorry, invalid response. Please enter the hours worked per week: ");
            hours = input.nextDouble();
        }

        System.out.print("Please enter the hourly pay rate: ");
        double pay = input.nextDouble();
        while (pay <= 0) {
            System.out.println("Sorry, invalid response. Please enter the hourly pay rate: ");
            pay = input.nextDouble();
        }

        System.out.print("Please enter the total vacation days: ");
        double vacation = input.nextDouble();
        while (vacation < 0) {
            System.out.println("Sorry, invalid response. Please enter the total vacation days: ");
            vacation = input.nextDouble();
        }

        System.out.println("The total yearly salary is $" + calculateSalary(hours, pay, vacation));
    }
}
