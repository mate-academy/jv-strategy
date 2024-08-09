package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountService implements DiscountService {
    public static final double DISCOUNT = 0;

    public double getDiscount() {
        return DISCOUNT;
    }
}
