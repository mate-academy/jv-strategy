package core.basesyntax.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    public static final String BLACK_FRIDAY = "Black Friday";

    @Override
    public double getDiscount() {
        return 45;
    }

    public boolean isApplicable(String specialEvent) {
        return BLACK_FRIDAY.equals(specialEvent);
    }
}
