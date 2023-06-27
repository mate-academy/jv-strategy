package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFriday implements DiscountService {
    @Override
    public double getDiscount(double price) {
        return (double) price * 0.55;
    }
}
