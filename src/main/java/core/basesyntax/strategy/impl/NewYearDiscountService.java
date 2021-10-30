package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    private static final double DISCOUNT_PERCENT = 20;

    @Override
    public double getDiscount() {
        return DISCOUNT_PERCENT;
    }
}
