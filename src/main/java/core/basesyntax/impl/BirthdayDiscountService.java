package core.basesyntax.impl;

import core.basesyntax.strategy.DiscountService;

public class implements DiscountService {

    @Override
    public double getDiscount() {
        return 33;
    }
}
