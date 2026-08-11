package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    private static final double discount = 33;

    @Override
    public double getDiscount() {
        return discount;
    }
}
