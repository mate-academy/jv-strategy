package core.basesyntax;

import core.basesyntax.strategy.impl.DiscountService;

public class NewYearDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 20;
    }
}
