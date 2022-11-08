package core.basesyntax.strategy.impl;

import core.basesyntax.DiscountService;

public class BlackFriday extends DiscountService {
    @Override
    public double getDiscount() {
        return 45;
    }
}
