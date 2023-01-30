package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountService implements DiscountService {
    @Override
    public double getDiscount(int price, double discount) {
        return (price * 0.0) / 100;
    }
}
