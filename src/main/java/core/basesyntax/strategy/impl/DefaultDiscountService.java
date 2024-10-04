package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountService implements DiscountService {
    private static final double DISCOUNT_PERCENTAGE = 0.0;

    @Override
    public double getDiscount(double price) {
        return (price * DISCOUNT_PERCENTAGE) / 100;
    }
}
