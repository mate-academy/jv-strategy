package core.basesyntax.strategy.iml;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountService implements DiscountService {
    private static final double DISCOUNT = 0;

    @Override
    public double getDiscount() {
        return DISCOUNT;
    }
}
