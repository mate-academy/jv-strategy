package core.basesyntax.strategy.implament;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 20.0;
    }
}
