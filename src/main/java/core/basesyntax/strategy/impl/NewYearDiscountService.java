package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    private static final int DISCOUNT = 20;

    @Override
    public double getDiscount() {
        return DISCOUNT;
    }
}
