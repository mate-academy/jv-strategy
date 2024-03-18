package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    private double blackFridayDiscountService = 45.0;

    @Override
    public double getDiscount() {
        return blackFridayDiscountService;
    }
}
