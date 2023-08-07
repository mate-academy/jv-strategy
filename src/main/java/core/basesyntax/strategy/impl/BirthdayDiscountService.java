package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService extends DefaultDiscountService implements DiscountService {
    public double getDiscount() {
        return (double)33;
    }
}
