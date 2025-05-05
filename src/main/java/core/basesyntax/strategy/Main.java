package core.basesyntax.strategy;

import core.basesyntax.DiscountStrategy;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        discountStrategy.getDiscountServiceBySpecialEvent("New Year");
    }
}
