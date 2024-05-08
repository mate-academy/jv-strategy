package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    @Override
    public double getDiscount(int price, int discount) {
        return (double) ((price / 100) * (100 - 20));
    }
}
