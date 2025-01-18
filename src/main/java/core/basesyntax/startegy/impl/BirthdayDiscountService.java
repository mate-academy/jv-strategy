package core.basesyntax.startegy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {

    @Override
    public int getDiscount() {
        return 33;
    }
}
