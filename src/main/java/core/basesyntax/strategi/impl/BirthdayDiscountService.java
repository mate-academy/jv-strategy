package core.basesyntax.strategi.impl;

import core.basesyntax.strategi.DiscountService;

public class BirthdayDiscountService implements DiscountService {

    @Override
    public double getDiscount() {
        return 33;
    }
}
