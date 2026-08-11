package core.basesyntax.strategy.imp;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountServiceImpl implements DiscountService {
    @Override
    public double getDiscount() {
        return 45;
    }
}
