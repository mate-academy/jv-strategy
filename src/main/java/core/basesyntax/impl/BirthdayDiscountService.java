package core.basesyntax.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    private static final double birthdayDiscount = 33;

    @Override
    public double getDiscount() {
        return birthdayDiscount;
    }
}
