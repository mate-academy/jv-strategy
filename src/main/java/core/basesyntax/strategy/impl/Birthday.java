package core.basesyntax.strategy.impl;

import core.basesyntax.DiscountService;

public class Birthday extends DiscountService {
    @Override
    public double getDiscount() { return 33; }
}
