public class CalculateMealPrice {

    public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate){
        double tip = listedMealPrice * tipRate;
        double tax = listedMealPrice * taxRate;
        double result = listedMealPrice + tip + tax;
        return result;

    }

    public static void main(String[] args) {
        double groupTotalMealPrice = calculateTotalMealPrice(15, .2, .08);
        System.out.println(groupTotalMealPrice);
    }
}
