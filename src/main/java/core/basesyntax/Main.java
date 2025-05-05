package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();
        DiscountService n = strategy.getDiscountServiceBySpecialEvent("New Year");
        double costN = n.getDiscount();
        System.out.println(costN);
    }
}
