package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    private double discount = 45;

    @Override
    public double getDiscount() {
        return discount;
    }
}
