package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    private static final double DISCOUNT = 0.33;

    @Override
    public double getDiscount(double totalPrice) {
        return totalPrice * DISCOUNT;
    }
}
