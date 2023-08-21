package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    private static final double DISCOUNT = 20;

    @Override
    public double getDiscount() {
        return (double) DISCOUNT;
    }
}
