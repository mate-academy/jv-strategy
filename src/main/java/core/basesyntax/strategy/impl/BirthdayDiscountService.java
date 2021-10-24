package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
//    33

    @Override
    public double getDiscount() {
        return 33;
    }
}
