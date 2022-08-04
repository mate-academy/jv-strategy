package impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    private static final double REBATE = 33.0;

    @Override
    public double getDiscount() {
        return REBATE;
    }
}
