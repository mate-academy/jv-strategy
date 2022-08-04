package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    private final double discount = 20;

    @Override
    public double getDiscount() {
        return (double) discount;
    }
}
