package core.basesyntax.strategy;

import core.basesyntax.strategy.impl.DiscountService;

public class NewYearDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 20.0;
    }
}
