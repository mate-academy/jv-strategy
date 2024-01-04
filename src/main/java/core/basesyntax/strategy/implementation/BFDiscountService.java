package core.basesyntax.strategy.implementation;

import core.basesyntax.strategy.DiscountService;

public class BFDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 45;
    }

}
