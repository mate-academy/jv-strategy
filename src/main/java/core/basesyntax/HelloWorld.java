package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class HelloWorld {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        DiscountService discountService = discountStrategy.getDiscountServiceBySpecialEvent("New Year");
        System.out.println("Discount: " + discountService.getDiscount() + "%");
    }

}