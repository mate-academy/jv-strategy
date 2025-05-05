package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        DiscountService newYearDiscountStrategy = discountStrategy
                .getDiscountServiceBySpecialEvent("New Year");
        double discount = newYearDiscountStrategy.getDiscount();
    }
}
