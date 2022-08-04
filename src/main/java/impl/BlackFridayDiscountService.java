package impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    private static final double REBATE = 45.0;

    @Override
    public double getDiscount() {
        return REBATE;
    }
}
