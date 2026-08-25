package core.basesyntax.strategy.iml;

import core.basesyntax.DiscountService;

public class BirthdayDiscountService implements DiscountService {

    @Override
    public double getDiscount() {
        return (double) 33;
    }
}
