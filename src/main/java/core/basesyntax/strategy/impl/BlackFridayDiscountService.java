package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    private final static double DISCOUNT = 0.45;

    @Override
    public double getDiscount(double price) {
        return price * DISCOUNT;
    }
}
