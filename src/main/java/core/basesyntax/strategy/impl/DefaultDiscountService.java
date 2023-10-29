package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountService implements DiscountService {
    private static final double DISCOUNT_DEFAULT = 0.0;

    @Override
    public double getDiscount() {
        return DISCOUNT_DEFAULT;
    }
}