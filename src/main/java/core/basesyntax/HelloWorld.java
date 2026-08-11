package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        DiscountStrategy newStrategy = new DiscountStrategy();
        DiscountService tryService = newStrategy.getDiscountServiceBySpecialEvent("Black Friday");
        double discount = tryService.getDiscount();
        System.out.println(discount);
    }
}
