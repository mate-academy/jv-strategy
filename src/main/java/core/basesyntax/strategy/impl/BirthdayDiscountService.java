package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    private double birthdayDiscount = 33.0;

    @Override
    public double getDiscount() {
        return birthdayDiscount;
    }
}
