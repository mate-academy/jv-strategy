package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYear implements DiscountService {
    @Override
    public double getDiscount() {
        return 20;
    }
}
