package core.basesyntax.impl;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountService implements DiscountService {

    static final double DEFAULT_DISCOUNT = 0;

    @Override
    public double getDiscount() {
        return DEFAULT_DISCOUNT;
    }
}
