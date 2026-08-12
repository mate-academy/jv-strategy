package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscount implements DiscountService {
    private static final double DISCOUNT = 0;

    @Override
    public double getDiscount() {
        return DISCOUNT;
    }
}
