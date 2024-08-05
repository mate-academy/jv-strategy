package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountService implements DiscountService {
    private static final double DEFAULT_DIS = 0;

    public double getDefaultDis() {
        return DEFAULT_DIS;
    }

    @Override
    public double getDiscount() {
        return getDefaultDis();
    }
}
