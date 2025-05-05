package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountService implements DiscountService {
    private static final double DISCOUNT = 0;

    @Override
    public double getDiscount() {
        return (double) DISCOUNT;
    }
}
