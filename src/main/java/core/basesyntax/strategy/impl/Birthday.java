package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class Birthday implements DiscountService {
    @Override
    public double getDiscount() {
        return (double) 33.0;
    }
}
