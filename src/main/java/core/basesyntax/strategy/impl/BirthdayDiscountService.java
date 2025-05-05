package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    static final int BIRTHDAY_DISCOUNT = 33;

    @Override
    public double getDiscount() {
        return BIRTHDAY_DISCOUNT;
    }
}
