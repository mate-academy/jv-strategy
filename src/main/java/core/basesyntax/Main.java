package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();
        DiscountService discountStrategy = strategy.getDiscountServiceBySpecialEvent("Birthday");
        double price = discountStrategy.getDiscount();
        System.out.println(price);
    }

}
