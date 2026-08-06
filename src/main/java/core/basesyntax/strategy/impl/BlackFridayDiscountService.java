package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    private static final int DISCOUNT_VALUE = 45;

    @Override
    public double getDiscount() {
        return DISCOUNT_VALUE;
    }
}
