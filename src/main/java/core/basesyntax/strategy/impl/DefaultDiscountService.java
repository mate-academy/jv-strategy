package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountService implements DiscountService {
    private int discount = 0;

    @Override
    public double getDiscount() {
        return discount;
    }
}
