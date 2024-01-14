package core.basesyntax.strategy.implementation;

import core.basesyntax.strategy.DiscountService;

public class HappyBirthdayDiscount implements DiscountService {

    @Override
    public double getDiscount() {
        return 33;
    }
}
