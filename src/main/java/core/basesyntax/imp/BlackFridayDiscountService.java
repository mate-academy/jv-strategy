package core.basesyntax.imp;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {

    @Override
    public double getDiscount() {
        return 45;
    }
}
