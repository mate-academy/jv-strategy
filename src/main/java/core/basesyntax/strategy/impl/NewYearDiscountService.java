package core.basesyntax.strategy.impl;

import core.basesyntax.DiscountStrategy;
import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    private static final int NEWYEAR_DISCOUNT = 20;

    @Override
    public double getDiscount() {
        return NEWYEAR_DISCOUNT;
    }
}
