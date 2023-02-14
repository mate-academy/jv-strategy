package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountService implements DiscountService {
    private static final double DAFAULT_DISCOUNT = 0.0;
    @Override
    public double getDiscount() {
        return DAFAULT_DISCOUNT;
    }
}
