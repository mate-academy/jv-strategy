package core.basesyntax.strategy.impl;

import core.basesyntax.DiscountStrategy;

public class BirthdayDiscountService extends DiscountStrategy {
    private static final byte BIRTHDAY_DISCOUNT = 33;

    @Override
    public double getDiscount() {
        return BIRTHDAY_DISCOUNT;
    }
}
