package core.basesyntax.strategy.impl;

public class BirthdayDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 33.0;
    }
}
