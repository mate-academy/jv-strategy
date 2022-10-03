package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        double discountPrice = 33;
        return discountPrice;
    }
}
