package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountService implements DiscountService {
    public static final double DISCOUNT_PERCENT = 0;

    @Override
    public double getDiscount() {
        return DISCOUNT_PERCENT;
    }
}
