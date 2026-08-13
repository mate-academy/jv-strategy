package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    private final double discount = 20.0;

    @Override
    public double getDiscount() {
        return discount;
    }
}
