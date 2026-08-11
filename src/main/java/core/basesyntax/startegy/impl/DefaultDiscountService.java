package core.basesyntax.startegy.impl;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountService implements DiscountService {
    @Override
    public int getDiscount() {
        return 0;
    }
}
