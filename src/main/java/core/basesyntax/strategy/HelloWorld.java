package core.basesyntax.strategy;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        DiscountService discount = discountStrategy.getDiscountServiceBySpecialEvent("Birthday");
        discount.getDiscount();
    }
}
