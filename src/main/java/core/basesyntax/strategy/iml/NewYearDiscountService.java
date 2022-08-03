package core.basesyntax.strategy.iml;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    private static final double DISCOUNT = 20;

    @Override
    public double getDiscount() {
        return DISCOUNT;
    }
}
