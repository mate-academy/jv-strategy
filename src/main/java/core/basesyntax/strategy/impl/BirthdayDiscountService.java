package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    private static final double BIRTHDAY_DIS = 33;

    public double getBirthdayDis() {
        return BIRTHDAY_DIS;
    }

    @Override
    public double getDiscount() {
        return getBirthdayDis();
    }
}
