package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    private static final double DISCOUNT = 0.45;

    @Override
    public double getDiscount(double totalPrice) {
        return totalPrice * DISCOUNT;
    }
}
