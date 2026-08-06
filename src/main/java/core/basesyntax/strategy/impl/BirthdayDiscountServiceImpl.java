package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountServiceImpl implements DiscountService {
    @Override
    public double getDiscount() {
        return 33;
    }
}
