package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class Application {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        DiscountService discount = discountStrategy.getDiscountServiceBySpecialEvent("Birthday");
        System.out.println(discount.getDiscount());
    }
}
