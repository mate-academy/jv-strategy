package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    public static final int BirthdayDiscountService = 33;

    @Override
    public double getDiscount() {
        return BirthdayDiscountService;
    }
}
