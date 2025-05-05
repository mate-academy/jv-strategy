package core.basesyntax.strategy.imp;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountServiceImpl implements DiscountService {
    @Override
    public double getDiscount() {
        return 20;
    }
}
