package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        double discountPrice = 45;
        return discountPrice;
    }
}
