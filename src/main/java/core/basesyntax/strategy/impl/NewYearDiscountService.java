package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    public static final int NewYearDiscountService = 20;

    @Override
    public double getDiscount() {
        return NewYearDiscountService;
    }
}
