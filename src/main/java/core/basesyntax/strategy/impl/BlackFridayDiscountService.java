package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    private static final double BLACKFRIDAY_DISCOUNT = 45D;

    @Override
    public double getDiscount() {
        return BLACKFRIDAY_DISCOUNT;
    }
}
