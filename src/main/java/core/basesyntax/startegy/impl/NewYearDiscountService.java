package core.basesyntax.startegy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    @Override
    public int getDiscount() {
        return 20;
    }
}
