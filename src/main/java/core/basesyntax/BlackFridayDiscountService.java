package core.basesyntax;

import core.basesyntax.strategy.impl.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 45;
    }
}
