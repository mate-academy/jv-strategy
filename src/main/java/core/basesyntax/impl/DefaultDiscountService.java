package core.basesyntax.impl;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountService implements DiscountService {
    private static final double defaultDiscount = 0;

    @Override
    public double getDiscount() {

        return defaultDiscount;
    }
}
