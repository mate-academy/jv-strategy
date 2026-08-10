package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        DiscountService discountService =
                discountStrategy.getDiscountServiceBySpecialEvent("New Year");
        double price = discountService.getDiscount();

        System.out.println(price);
    }
}
