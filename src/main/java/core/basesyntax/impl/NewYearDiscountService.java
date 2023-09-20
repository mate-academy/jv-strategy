package core.basesyntax.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    private static final double newYearDiscount = 20;

    @Override
    public double getDiscount() {

        return newYearDiscount;
    }
}
