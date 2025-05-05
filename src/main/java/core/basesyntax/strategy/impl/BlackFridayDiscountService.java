package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    public static final int BlackFridayDiscountService = 45;

    @Override
    public double getDiscount() {
        return BlackFridayDiscountService;
    }
}
