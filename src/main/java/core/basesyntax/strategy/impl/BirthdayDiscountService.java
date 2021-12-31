package core.basesyntax.strategy.impl;

public class BirthdayDiscountService {
    private static final double DISCOUNT = 33.0;
    @Override
    public double getDiscount() {
        return DISCOUNT;
    }
}
