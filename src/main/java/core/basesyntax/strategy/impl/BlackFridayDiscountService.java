package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {

    private static double DISCOUNT = 45.0;

    @Override
    public double getDiscount() {
        return DISCOUNT;
    }
}
