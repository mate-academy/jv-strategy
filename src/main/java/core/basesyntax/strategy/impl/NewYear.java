package core.basesyntax.strategy.impl;

import core.basesyntax.DiscountService;

public class NewYear extends DiscountService {
    @Override
    public double getDiscount() {
        return 20;
    }
}
