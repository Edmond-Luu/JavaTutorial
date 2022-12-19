public class SalaryCalculator {
    public static double calculateSalary(double hoursPerWeek, double payRate) {
        double weeklySalary = hoursPerWeek * payRate;
        return weeklySalary * 52;
    }

    public static void main(String[] args) {
        System.out.println(calculateSalary(40, 30));
    }
}
