package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        DiscountService discountService
                = discountStrategy.getDiscountServiceBySpecialEvent("Birthday");
        System.out.println(discountService.getDiscount());
    }
}
