package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    private static final double DISCOUNT_BIRTHDAY = 33.0;

    @Override
    public double getDiscount() {
        return DISCOUNT_BIRTHDAY;
    }
}