package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    private double discount = 33.0;

    public double getDiscount() {
        return discount;
    }
}
