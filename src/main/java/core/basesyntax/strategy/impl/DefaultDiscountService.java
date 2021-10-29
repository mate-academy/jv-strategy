package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 0;
    }
}
