package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[]args) {

        DiscountStrategy strategyDiscount = new DiscountStrategy();

        String specialEven = "New Year";

        DiscountService discountService = strategyDiscount
                .getDiscountServiceBySpecialEvent(specialEven);

        double discount = discountService.getDiscount();

        System.out.println(
                "It's a discount for " + specialEven + " which now stands  " + discount + " %");
    }
}
