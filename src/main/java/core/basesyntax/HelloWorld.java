package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        System.out.println(discountStrategy
                .getDiscountServiceBySpecialEvent("Birthday").getDiscount());
        System.out.println(discountStrategy
                .getDiscountServiceBySpecialEvent("Black Friday").getDiscount());
        System.out.println(discountStrategy
                .getDiscountServiceBySpecialEvent("New Year").getDiscount());
        System.out.println(discountStrategy
                .getDiscountServiceBySpecialEvent("Default").getDiscount());
    }
}
