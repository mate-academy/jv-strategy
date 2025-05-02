package core.basesyntax.strategi.impl;

import core.basesyntax.strategi.DiscountService;

public class DefaultDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 0;
    }
}
