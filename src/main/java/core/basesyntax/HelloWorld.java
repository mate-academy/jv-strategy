package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();
        DiscountService black = strategy.getDiscountServiceBySpecialEvent("Black Friday");
        double result = black.getDiscount();
        System.out.println(result);
    }

}
