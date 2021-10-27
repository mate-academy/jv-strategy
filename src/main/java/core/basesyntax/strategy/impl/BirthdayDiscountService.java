package core.basesyntax.strategy.impl;

import core.basesyntax.DiscountStrategy;
import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return DiscountStrategy.DISCOUNTS[2];
    }
}
