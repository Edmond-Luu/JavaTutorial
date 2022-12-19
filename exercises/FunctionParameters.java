public class FunctionParameters {
    // Like in JS, put the parameters in the function definition's parenthesis.
    public static void calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = tipRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Your total meal price is $" + result);
    }

    public static void main(String[] args) {
        calculateTotalMealPrice(15, 0.2, 0.08);
    }
}
