package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class DofaultDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return (int) 0;
    }
}

