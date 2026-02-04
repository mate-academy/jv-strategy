package core.basesyntax.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayService implements DiscountService {

    private double blackFridayDiscount = 45.0;

    public double getDiscount() {
        return blackFridayDiscount;
    }
}
