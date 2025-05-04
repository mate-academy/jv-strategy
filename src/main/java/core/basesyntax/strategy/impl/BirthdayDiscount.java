package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscount implements DiscountService {
    @Override
    public double getDiscount() {
        return 33.0;
    }
}
