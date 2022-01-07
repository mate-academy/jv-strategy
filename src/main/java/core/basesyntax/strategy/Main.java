package core.basesyntax.strategy;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.DiscountStrategy;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();
        DiscountService[] discounts = new DiscountService[4];
        discounts[0] = strategy.getDiscountServiceBySpecialEvent("Birthday");
        discounts[1] = strategy.getDiscountServiceBySpecialEvent("Black Friday");
        discounts[2] = strategy.getDiscountServiceBySpecialEvent("New Year");
        discounts[3] = strategy.getDiscountServiceBySpecialEvent("Cristmas");
        for (DiscountService discount : discounts) {
            System.out.println(discount.getDiscount());
        }
    }
}
