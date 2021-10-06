package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountStrategy;

public class BirthdayDiscountStrategy implements DiscountStrategy {
    private static final double DISCOUNT = 33.0;

    @Override
    public double calculatePriceWithDiscount(double originalPrice) {
        return (originalPrice * DISCOUNT) / 100.0;
    }
}
