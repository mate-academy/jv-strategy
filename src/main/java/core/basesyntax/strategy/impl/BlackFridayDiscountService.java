package core.basesyntax.strategy.impl;

import core.basesyntax.DiscountStrategy;
import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    private static final int BLACKFRIDAY_DISCOUNT = 45;

    @Override
    public double getDiscount() {
        return BLACKFRIDAY_DISCOUNT;
    }
}
