package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class Discount {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        DiscountService discountService = discountStrategy
                .getDiscountServiceBySpecialEvent("New Year");
        double discount = discountService.getDiscount();
        System.out.println(discount);
    }
}
