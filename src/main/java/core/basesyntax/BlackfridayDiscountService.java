package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class BlackfridayDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 45.0;
    }
}
