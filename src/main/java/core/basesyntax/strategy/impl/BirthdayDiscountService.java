package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    private static final double BIRTH_DAY_DISCOUNT_SERVICE = 33;

    @Override
    public double getDiscount() {
        return BIRTH_DAY_DISCOUNT_SERVICE;
    }
}
