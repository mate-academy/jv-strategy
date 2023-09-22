package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    private static final double DISCOUNT = 0.20;

    @Override
    public double getDiscount(double totalPrice) {
        return DISCOUNT * totalPrice;
    }
}
