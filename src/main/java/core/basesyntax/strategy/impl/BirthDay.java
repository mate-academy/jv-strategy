package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthDay implements DiscountService {
    @Override
    public double getDiscount() {
        return 33;
    }
}
