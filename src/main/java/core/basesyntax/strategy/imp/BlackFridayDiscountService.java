package core.basesyntax.strategy.imp;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        double discount = 45;
        return discount;
    }
}
