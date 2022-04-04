package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayService implements DiscountService {
    @Override
    public double getDiscount() {
        return 45.0;
    }
}
