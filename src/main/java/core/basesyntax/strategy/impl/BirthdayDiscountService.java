package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService extends DefaultDiscountService implements DiscountService {
    @Override
    public double getDiscount(int price) {
        return (double) price * 0.33;
    }
}
