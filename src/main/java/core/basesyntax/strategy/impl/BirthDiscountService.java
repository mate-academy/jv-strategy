package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 33;
    }
}
