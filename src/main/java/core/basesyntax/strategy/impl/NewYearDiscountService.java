package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    private int discount = 20;

    @Override
    public double getDiscount() {
        return discount;
    }
}
