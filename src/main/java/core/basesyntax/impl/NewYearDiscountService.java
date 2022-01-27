package core.basesyntax.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    public static final String NEW_YEAR = "New Year";

    @Override
    public double getDiscount() {
        return 20;
    }

    public boolean isApplicable(String specialEvent) {
        return NEW_YEAR.equals(specialEvent);
    }
}
