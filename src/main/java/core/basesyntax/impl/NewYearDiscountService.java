package core.basesyntax.impl;

import core.basesyntax.straregy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 20;
    }
}
