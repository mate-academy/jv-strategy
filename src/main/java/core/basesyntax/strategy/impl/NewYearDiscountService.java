package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    private static double DISCOUNT = 20.0;

    @Override
    public double getDiscount() {
        return DISCOUNT;
    }
}
