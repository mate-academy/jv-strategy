package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    private static double DISCOUNT = 20;

    @Override
    public double getDiscount() {
        return DISCOUNT;
    }
}
