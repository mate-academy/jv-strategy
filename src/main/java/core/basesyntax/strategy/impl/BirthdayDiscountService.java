package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    public static final double DISCOUNT_PERCENT = 33;

    @Override
    public double getDiscount() {
        return DISCOUNT_PERCENT;
    }
}
