package core.basesyntax.strategy.imlp;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 20;
    }
}
