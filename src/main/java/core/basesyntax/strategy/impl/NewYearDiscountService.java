package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    private static final int NEW_YEAR_DISCOUNT = 20;

    @Override
    public double getDiscount() {
        return NEW_YEAR_DISCOUNT;
    }
}
