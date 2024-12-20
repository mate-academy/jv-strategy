package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    private final int discountValue = 45;

    @Override
    public double getDiscount() {
        return (double) this.discountValue;
    }
}
