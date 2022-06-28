package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        DiscountService discountService = discountStrategy.getDiscountServiceBySpecialEvent("");
        double result = discountService.getDiscount();
        System.out.println(result);
    }
}
