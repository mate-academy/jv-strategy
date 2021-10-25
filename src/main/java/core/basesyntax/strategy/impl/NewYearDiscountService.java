package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    private static final double DISCOUNT_NEW_YEAR = 20;

    @Override
    public double getDiscount() {
        return DISCOUNT_NEW_YEAR;
    }
}
