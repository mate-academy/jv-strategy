package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class NewyearDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 20.0;
    }
}
