package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    private static final double NEW_YEAR_DIS = 20;

    public double getNewYearDis() {
        return NEW_YEAR_DIS;
    }

    @Override
    public double getDiscount() {
        return getNewYearDis();
    }
}
