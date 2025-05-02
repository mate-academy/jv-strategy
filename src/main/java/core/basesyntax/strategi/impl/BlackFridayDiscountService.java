package core.basesyntax.strategi.impl;

import core.basesyntax.strategi.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 45;
    }
}
