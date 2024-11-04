package core.basesyntax.imp;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {

    @Override
    public double getDiscount() {
        return 33;
    }
}
