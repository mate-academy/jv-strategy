package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class DefautlDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 0.0;
    }
}
