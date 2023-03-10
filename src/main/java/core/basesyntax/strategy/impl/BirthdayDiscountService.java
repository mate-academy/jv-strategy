package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    private static final double BIRTHDAY_DISCOUNT = 33D;

    @Override
    public double getDiscount() {
        return BIRTHDAY_DISCOUNT;
    }
}
