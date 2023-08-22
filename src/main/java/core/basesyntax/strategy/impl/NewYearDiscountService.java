package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    private static final double NEW_YEAR_DISCOUNT_AMOUNT = 20.0;

    @Override
    public double getDiscount() {
        return NEW_YEAR_DISCOUNT_AMOUNT;
    }
}
