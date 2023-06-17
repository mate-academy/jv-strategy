package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    private final double discountAmount = 33;

    @Override
    public double getDiscount() {
        return discountAmount;
    }
}
