package core.basesyntax.strategy.impl;

import core.basesyntax.DiscountStrategy;
import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService extends DiscountStrategy
        implements DiscountService {
    @Override
    public double getDiscount() {
        return 0.0;
    }
}
