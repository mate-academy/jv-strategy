package core.basesyntax.stradegy.impl;

import core.basesyntax.stradegy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    public double getDiscount() {
        return 33;
    }
}
