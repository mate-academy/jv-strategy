package core.basesyntax.strategy.impl;

import core.basesyntax.DiscountStrategy;

public class NewYearDiscountService extends DiscountStrategy {
    private static final byte NEW_YEAR_DISCOUNT = 20;

    @Override
    public double getDiscount() {
        return NEW_YEAR_DISCOUNT;
    }
}
