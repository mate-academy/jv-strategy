package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    private static final double DISCOUNT_PERCENT = 45;

    @Override
    public double getDiscount() {
        return DISCOUNT_PERCENT;
    }
}
