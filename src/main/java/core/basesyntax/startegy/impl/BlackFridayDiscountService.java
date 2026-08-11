package core.basesyntax.startegy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    @Override
    public int getDiscount() {
        return 45;
    }
}
