package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();
        DiscountService discount = strategy.getDiscountServiceBySpecialEvent("Black Friday");
        System.out.println(discount.getDiscount());
    }
}
