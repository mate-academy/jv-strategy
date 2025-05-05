package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountStrategy implements DiscountService {

    @Override
    public double getDiscount() {
        return (double) 20;
    }
}
