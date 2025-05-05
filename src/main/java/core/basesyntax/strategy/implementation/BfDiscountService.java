package core.basesyntax.strategy.implementation;

import core.basesyntax.strategy.DiscountService;

public class BfDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 45;
    }

}
