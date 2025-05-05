package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountService implements DiscountService {
    private String specialEvent = "Default";

    @Override
    public double getDiscount() {
        return 0;
    }

    public String getSpecialEvent() {
        return this.specialEvent;
    }

    public void setSpecialEvent(String specialEvent) {
        this.specialEvent = specialEvent;
    }
}
