package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class HelloWorld {
    public static void main(String [] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        DiscountService newYear = discountStrategy.getDiscountServiceBySpecialEvent("New Year");
        double discount = newYear.getDiscount();
        System.out.println(discount);
    }
}
