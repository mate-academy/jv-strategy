package core.basesyntax.strategy.impl;

import core.basesyntax.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    private static final double BIRTHDAY_DISCOUNT = 33;

    @Override
    public double getDiscount() {
        return BIRTHDAY_DISCOUNT;
    }
}
