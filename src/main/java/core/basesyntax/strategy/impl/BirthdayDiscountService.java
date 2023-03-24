package core.basesyntax.strategy.impl;

import core.basesyntax.DiscountStrategy;
import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService extends DiscountStrategy implements DiscountService {
    @Override
    public double getDiscount() {
        return 33.0;
    }
}
