package core.basesyntax.strategy.impl;

import core.basesyntax.DiscountService;

public class BirthdayDiscountService implements DiscountService {

    @Override
    public double getDiscount() {
        return 33.0;
    }
}
