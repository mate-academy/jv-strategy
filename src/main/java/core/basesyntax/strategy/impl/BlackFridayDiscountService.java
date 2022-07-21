package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService extends DefaultDiscountService implements DiscountService {

    @Override
    public double getDiscount(int price) {
        return (double) price * 0.45;
    }
}
