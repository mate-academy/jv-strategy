package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDidcountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 45;
    }
}
