package core.basesyntax.strategy.impl;

import core.basesyntax.DiscountStrategy;

public class BlackFridayDiscountService extends DiscountStrategy {
    private static final byte BLACK_FRIDAY_DISCOUNT = 45;

    @Override
    public double getDiscount() {
        return BLACK_FRIDAY_DISCOUNT;
    }
}
