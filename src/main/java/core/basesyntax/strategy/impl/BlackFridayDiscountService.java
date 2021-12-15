package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    public static final double BLAKCDISCOUNT = 45.0d;
    @Override
    public double getDiscount() {
        return BLAKCDISCOUNT;
    }
}
