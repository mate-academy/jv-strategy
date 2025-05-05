package core.basesyntax.strategy;

import core.basesyntax.DiscountStrategy;

public class Main {
    public static void main(String[] args) {
        String[] specialEvent = {"Birthday", "Black Friday", "New Year"};

        DiscountStrategy discountStrategy = new DiscountStrategy();

        double discount = discountStrategy
                .getDiscountServiceBySpecialEvent(specialEvent[0])
                .getDiscount();
        System.out.println("Discount for " + specialEvent[0] + ": " + discount + "%");
    }
}
