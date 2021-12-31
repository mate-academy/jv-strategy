package core.basesyntax.strategy.impl;

public class BlackFridayDiscountService {
    private static final double DISCOUNT = 45.0;
    @Override
    public double getDiscount() {
        return DISCOUNT;
    }
}
