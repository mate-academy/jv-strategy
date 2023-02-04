package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    private final static double DISCOUNT = 0.3;

    @Override
    public double getDiscount(double price) {
        return price * DISCOUNT;
    }
}
