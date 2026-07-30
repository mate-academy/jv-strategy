package core.basesyntax.impl;

import core.basesyntax.straregy.DiscountService;

public class DefaultDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 0;
    }
}
