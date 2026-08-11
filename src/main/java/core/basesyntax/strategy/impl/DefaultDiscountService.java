package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountService implements DiscountService {
    private final int discountValue = 0;

    @Override
    public double getDiscount() {
        return (double) this.discountValue;
    }
}
