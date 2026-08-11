package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    private double discountBirthday = 33.0;

    @Override
    public double getDiscount() {
        return discountBirthday;
    }
}
