package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    @Override
    public double getDiscount(int basicPrice) {
        return (double) (basicPrice / 100) * 45;
    }
}
