package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        DiscountService spesialEvent = discountStrategy
                .getDiscountServiceBySpecialEvent("Black Friday");
        double discount = spesialEvent.getDiscount();
        System.out.println(discount);
    }

}
