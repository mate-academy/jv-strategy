package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountStrategy;

public class NewYearDiscountStrategy implements DiscountStrategy {
    private static final double DISCOUNT = 20.0;

    @Override
    public double calculatePriceWithDiscount(double originalPrice) {
        return (originalPrice * DISCOUNT) / 100.0;
    }
}
