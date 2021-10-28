package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    private static final double BLACK_FRIDAY = 45.0;
    @Override
    public double getDiscount() {
        return BLACK_FRIDAY;
    }
}
