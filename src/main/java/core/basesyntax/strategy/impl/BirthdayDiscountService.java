package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    public BirthdayDiscountService() {
        getDiscount();
    }

    @Override
    public double getDiscount() {
        return 33;
    }
}
