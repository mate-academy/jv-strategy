package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountService extends BlackFridayDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 0;
    }
}
