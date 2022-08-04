package impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    private static final double REBATE = 20.0;

    @Override
    public double getDiscount() {
        return REBATE;
    }
}
