package core.basesyntax.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    private static final double blackFridaDiscount = 45;

    @Override
    public double getDiscount() {
        return blackFridaDiscount;
    }
}
