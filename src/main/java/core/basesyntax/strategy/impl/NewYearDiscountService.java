package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    private static final double DISCOUNTNY = 20.0;

    @Override
    public double getDiscount() {
        return DISCOUNTNY;
    }
}
