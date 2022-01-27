package core.basesyntax.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    public static final String BIRTHDAY = "Birthday";

    @Override
    public double getDiscount() {
        return 33;
    }

    public boolean isApplicable(String specialEvent) {
        return BIRTHDAY.equals(specialEvent);
    }
}
