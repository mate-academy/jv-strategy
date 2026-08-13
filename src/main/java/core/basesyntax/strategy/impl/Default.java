package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class Default implements DiscountService {
    @Override
    public double getDiscount() {
        return 0;
    }
}
