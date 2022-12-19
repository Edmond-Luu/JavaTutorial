public class SalaryCalculator {
    public static double calculateSalary(double hoursPerWeek, double payRate, int vacationDays) {
        double weeklySalary = hoursPerWeek * payRate;
        double yearlySalary = (weeklySalary * 52) - (vacationDays * 8 * payRate);
        return yearlySalary;
    }

    public static void main(String[] args) {
        System.out.println(calculateSalary(40, 30, 10));
    }
}
