package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    private static final int BIRTHDAY_DISCOUNT_VALUE = 33;

    @Override
    public double getDiscount() {
        return BIRTHDAY_DISCOUNT_VALUE;
    }
}
