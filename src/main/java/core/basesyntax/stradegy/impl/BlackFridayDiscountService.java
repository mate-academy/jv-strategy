package core.basesyntax.stradegy.impl;

import core.basesyntax.stradegy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    public double getDiscount() {
        return 45;
    }
}
