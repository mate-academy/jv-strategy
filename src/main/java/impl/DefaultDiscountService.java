package impl;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountService implements DiscountService {
    private static final double REBATE = 0;

    @Override
    public double getDiscount() {
        return REBATE;
    }
}
