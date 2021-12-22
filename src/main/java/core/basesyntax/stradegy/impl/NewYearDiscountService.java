package core.basesyntax.stradegy.impl;

import core.basesyntax.stradegy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    public double getDiscount() {
        return 20;
    }
}
