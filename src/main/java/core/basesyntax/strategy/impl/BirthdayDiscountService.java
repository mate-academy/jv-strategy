package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    public double getDiscount(int price, double discount) {
        return (price * 0.33) /100;
    }
}
