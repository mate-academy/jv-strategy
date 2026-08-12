package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    public BlackFridayDiscountService() {
        getDiscount();
    }

    @Override
    public double getDiscount() {
        return 45;
    }
}
