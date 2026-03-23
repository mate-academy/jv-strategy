package core.basesyntax.strategy.impl;

import core.basesyntax.DiscountService;

public class DefaultDiscontService implements DiscountService {
    @Override
    public double getDiscount() {
        return (double) 0;
    }
}
