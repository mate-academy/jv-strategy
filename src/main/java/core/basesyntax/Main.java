package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();
        DiscountService discountService = strategy.getDiscountServiceBySpecialEvent("blackFriday");
        double discount = discountService.getDiscount(900);
        System.out.println(discount);


    }

}
