package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    private static final int DISCOUNT_VALUE = 20;

    @Override
    public double getDiscount() {
        return DISCOUNT_VALUE;
    }
}
