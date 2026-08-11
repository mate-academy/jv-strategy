package core.basesyntax.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {

    private double newYearDiscount = 20.0;

    public double getDiscount() {
        return newYearDiscount;
    }
}
