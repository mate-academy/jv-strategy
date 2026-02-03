package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    double DISCOUNT_BLACK_FRIDAY = 45.0;
    @Override
    public double getDiscount() {
        return DISCOUNT_BLACK_FRIDAY;
    }
}
