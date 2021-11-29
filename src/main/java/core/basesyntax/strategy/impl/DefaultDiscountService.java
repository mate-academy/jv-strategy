package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountService implements DiscountService {
    private static final double DEFAULT_DISCOUNT_AMOUNT = 0.0;

    @Override
    public double getDiscount() {
        return DEFAULT_DISCOUNT_AMOUNT;
    }
}
