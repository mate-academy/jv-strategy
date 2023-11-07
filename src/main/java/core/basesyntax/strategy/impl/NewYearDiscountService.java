package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    public String specialEvent = "New Year";

    @Override
    public double getDiscount() {
        return 20;
    }
}
