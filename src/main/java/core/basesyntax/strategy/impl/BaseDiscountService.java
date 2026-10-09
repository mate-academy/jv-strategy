package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BaseDiscountService implements DiscountService {
    private static final double ZERO_DISCOUNT = 0;
    private final String specialEvent;

    public BaseDiscountService(String specialEvent) {
        this.specialEvent = specialEvent;
    }

    public String getSpecialEvent() {
        return specialEvent;
    }

    @Override
    public double getDiscount() {
        return ZERO_DISCOUNT;
    }
}
