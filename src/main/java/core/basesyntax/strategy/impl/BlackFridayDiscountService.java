package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    private static final int BLACK_FRIDAY_DISCOUNT = 45;

    @Override
    public double getDiscount() {
        return BLACK_FRIDAY_DISCOUNT;
    }
}
