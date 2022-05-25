package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscontService implements DiscountService {
    @Override
    public double getDiscount(double amount) {
        return amount;
    }
}
