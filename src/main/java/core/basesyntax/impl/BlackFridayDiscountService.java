package core.basesyntax.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {

    static final double BLACK_FRIDAY_DISCOUNT = 45;

    @Override
    public double getDiscount() {
        return BLACK_FRIDAY_DISCOUNT;
    }
}
