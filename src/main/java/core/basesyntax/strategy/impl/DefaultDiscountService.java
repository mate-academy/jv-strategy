package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountService implements DiscountService {
    private static final int DISCOUNT = 0;

    @Override
    public double getDiscount() {
        return DISCOUNT;
    }
}
