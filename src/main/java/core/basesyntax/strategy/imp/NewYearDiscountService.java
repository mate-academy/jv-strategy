package core.basesyntax.strategy.imp;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        double discount = 20;
        return discount;
    }
}
