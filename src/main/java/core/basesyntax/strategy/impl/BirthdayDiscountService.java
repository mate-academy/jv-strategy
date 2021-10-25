package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    private static final int birthdayDiscount = 33;

    @Override
    public double getDiscount() {
        return birthdayDiscount;
    }
}
