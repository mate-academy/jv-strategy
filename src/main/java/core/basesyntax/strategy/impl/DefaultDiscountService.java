package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountService implements DiscountService {
    private static final int DEFAULT_DISCOUNT_VALUE = 0;

    @Override
    public double getDiscount() {
        return DEFAULT_DISCOUNT_VALUE;
    }
}
