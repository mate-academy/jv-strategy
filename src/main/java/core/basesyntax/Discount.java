package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class Discount {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        DiscountService newYearDiscountService =
                discountStrategy.getDiscountServiceBySpecialEvent("NewYear");
        double rabatt = newYearDiscountService.getDiscount();
    }
}
