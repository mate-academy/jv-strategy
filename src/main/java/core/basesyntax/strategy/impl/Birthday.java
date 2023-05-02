package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class Birthday implements DiscountService {
    public double getDiscount() {
        return 33;
    }
}

