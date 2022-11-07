package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    private static final double DISCOUNT_HEWYEAR = 20.0;

    @Override
    public double getDiscount() {
        return DISCOUNT_HEWYEAR;
    }
}
