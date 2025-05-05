package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountService implements DiscountService {
    private double defaultDiscountService = 0.0;

    @Override
    public double getDiscount() {
        return defaultDiscountService;
    }
}
