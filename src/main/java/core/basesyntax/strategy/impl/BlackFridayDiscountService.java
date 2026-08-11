package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    private static final double BLACK_FRIDAY_DIS = 45;

    public double getBlackFridayDis() {
        return BLACK_FRIDAY_DIS;
    }

    @Override
    public double getDiscount() {
        return getBlackFridayDis();
    }
}
