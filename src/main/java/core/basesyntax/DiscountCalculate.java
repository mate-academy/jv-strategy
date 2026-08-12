package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class DiscountCalculate {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        DiscountService discountService =
                discountStrategy.getDiscountServiceBySpecialEvent("NewYear");
        double newYearDiscount = discountService.getDiscount();
        System.out.println(newYearDiscount);
    }
}
