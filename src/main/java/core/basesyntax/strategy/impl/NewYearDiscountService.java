package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    private double discount = 20.0;

    public double getDiscount() {
        return discount;
    }
}
