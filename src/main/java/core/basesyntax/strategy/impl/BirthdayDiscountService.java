package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    @Override
    public double getDiscount(int basicPrice) {
        return (double) (basicPrice / 100) * 33;
    }
}
