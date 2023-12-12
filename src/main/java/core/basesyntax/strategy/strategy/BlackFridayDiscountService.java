package core.basesyntax.strategy.strategy;

import core.basesyntax.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 45;
    }
}
