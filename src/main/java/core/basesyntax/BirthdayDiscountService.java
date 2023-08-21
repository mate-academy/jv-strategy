package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    private static final double DISCOUNT = 33;

    @Override
    public double getDiscount() {
        return (double) DISCOUNT;
    }
}
