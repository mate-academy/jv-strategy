package core.basesyntax.strategy.strategy;

import core.basesyntax.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 33;
    }
}
