package core.basesyntax.impl;

import core.basesyntax.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 45.0;
    }
}
