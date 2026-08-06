package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    private static final int DISCOUNT_VALUE = 33;

    @Override
    public double getDiscount() {
        return DISCOUNT_VALUE;
    }
}
