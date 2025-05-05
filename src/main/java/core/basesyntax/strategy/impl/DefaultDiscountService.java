package core.basesyntax.strategy.impl;

import core.basesyntax.DiscountStrategy;

public class DefaultDiscountService extends DiscountStrategy {

    @Override
    public double getDiscount() {
        return 0;
    }
}
