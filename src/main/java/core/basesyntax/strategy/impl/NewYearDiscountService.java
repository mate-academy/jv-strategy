package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    private static final double NEWYEAR_DISCOUNT = 20D;

    @Override
    public double getDiscount() {
        return NEWYEAR_DISCOUNT;
    }
}
