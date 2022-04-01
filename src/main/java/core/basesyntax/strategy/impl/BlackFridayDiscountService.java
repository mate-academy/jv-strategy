package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    private double bfDiscount = 45;

    @Override
    public double getDiscount() {
        return bfDiscount;
    }
}
