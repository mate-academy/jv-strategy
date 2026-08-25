package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.DiscountStrategy;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        DiscountService discountService = discountStrategy
                .getDiscountServiceBySpecialEvent("Birthday");
        double discount = discountService.getDiscount();
        System.out.println("Your discount is: " + discount);
    }
}
