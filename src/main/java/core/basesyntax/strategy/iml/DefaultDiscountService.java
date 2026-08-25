package core.basesyntax.strategy.iml;

import core.basesyntax.DiscountService;

public class DefaultDiscountService implements DiscountService {

    @Override
    public double getDiscount() {
        return (double) 0;
    }
}
