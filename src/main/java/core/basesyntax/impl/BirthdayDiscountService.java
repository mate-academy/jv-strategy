package core.basesyntax.impl;

import core.basesyntax.straregy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 33;
    }
}
