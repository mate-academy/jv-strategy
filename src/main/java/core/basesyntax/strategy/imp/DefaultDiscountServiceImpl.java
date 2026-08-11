package core.basesyntax.strategy.imp;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountServiceImpl implements DiscountService {
    @Override
    public double getDiscount() {
        return 0;
    }
}
