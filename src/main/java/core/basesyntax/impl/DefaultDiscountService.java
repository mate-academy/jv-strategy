package core.basesyntax.impl;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountService implements DiscountService {

    private double defaultDiscount = 0.0;

    public double getDiscount() {
        return defaultDiscount;
    }

}
