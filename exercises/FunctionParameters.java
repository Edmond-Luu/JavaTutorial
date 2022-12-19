public class FunctionParameters {
    // Like in JS, put the parameters in the function definition's parenthesis.
    // If you want a function to return a value, change void (return nothing) to the type.

    public static void sampleFunction(){
        // THIS FUNCTION RETURNS NOTHING BECAUSE IT HAS VOID AT THE TOP.
    }

    public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return result;
    }

    public static void main(String[] args) {
        double groupTotalMealPrice = calculateTotalMealPrice(100, 0.2, 0.08);
        System.out.println(groupTotalMealPrice / 5);
    }
}
