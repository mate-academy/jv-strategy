package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    public String specialEvent = "Birthday";

    @Override
    public double getDiscount() {
        return 33;
    }
}
