package core.basesyntax.strategy.implementations;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    @Override
    public int getDiscount() {
        return 33;
    }
}
