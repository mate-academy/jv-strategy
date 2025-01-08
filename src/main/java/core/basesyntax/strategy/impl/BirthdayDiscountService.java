package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    @Override
    public double getDiscount(double prise, double discount) {
        return (double) ((prise / 100) * discount);
    }
}
