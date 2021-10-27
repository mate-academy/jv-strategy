package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    private static final double DISCOUNT = 0.2;

    @Override
    public double getDiscount() {
        return DISCOUNT;
    }
}
