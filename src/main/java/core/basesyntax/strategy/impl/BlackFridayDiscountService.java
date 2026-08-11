package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    public static final double DISCOUNT_PERCENT = 45;

    public double getDiscount() {
        return DISCOUNT_PERCENT;

    }
}
