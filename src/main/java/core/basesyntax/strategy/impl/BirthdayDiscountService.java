package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    private final int discountValue = 33;

    @Override
    public double getDiscount() {
        return (double) this.discountValue;
    }
}
