package core.basesyntax.strategy.iml;

import core.basesyntax.DiscountService;

public class BlackFridayDiscountService implements DiscountService {

    @Override
    public double getDiscount() {
        return (double) 45;
    }
}
