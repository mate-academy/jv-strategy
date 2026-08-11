package core.basesyntax.strategi.impl;

import core.basesyntax.strategi.DiscountService;

public class NewYearDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 20;
    }
}
