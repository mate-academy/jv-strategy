package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();
        DiscountService birthdayDiscount = strategy.getDiscountServiceBySpecialEvent("Birthday");
        System.out.println(birthdayDiscount.getDiscount());
    }
}
