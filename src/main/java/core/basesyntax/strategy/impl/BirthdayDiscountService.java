package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    @Override
    public Integer getDiscount() {
        return 33;
    }
}
