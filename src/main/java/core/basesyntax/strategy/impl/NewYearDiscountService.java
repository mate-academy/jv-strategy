package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    @Override
    public double getDiscount(int price) {
        return price * 0.8;
    }
}
