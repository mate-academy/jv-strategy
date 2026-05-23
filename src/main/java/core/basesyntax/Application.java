package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.DiscountStrategy;

public class Application {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();
        DiscountService discountService = strategy.getDiscountServiceBySpecialEvent("Black Friday");
        double discount = discountService.getDiscount();
        System.out.println(discount);
    }
}
