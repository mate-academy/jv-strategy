package core.basesyntax;

import core.basesyntax.strategy.impl.DiscountService;

public class DefaultDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 0;
    }
}
