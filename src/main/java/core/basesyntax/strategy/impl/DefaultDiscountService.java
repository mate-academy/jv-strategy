package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountService implements DiscountService {
    public static final int DefaultDiscountService = 0;

    @Override
    public double getDiscount() {
        return DefaultDiscountService;
    }
}
