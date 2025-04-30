package core.basesyntax.strategy.imp;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        double discount = 33;
        return discount;
    }
}
