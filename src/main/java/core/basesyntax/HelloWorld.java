package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class HelloWorld {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        DiscountService discountService = discountStrategy
                .getDiscountServiceBySpecialEvent("Birthday");
        System.out.println("if you born this day, you have "
                + discountService.getDiscount() + "% of discount");
    }
}
