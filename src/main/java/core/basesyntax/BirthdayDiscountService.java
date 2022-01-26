package core.basesyntax;

import core.basesyntax.strategy.impl.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 33;
    }
}
