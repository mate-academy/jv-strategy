package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService extends BlackFridayDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 33.0;
    }
}
