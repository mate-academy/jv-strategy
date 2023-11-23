package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    private String specialEvent = "Birthday";

    @Override
    public double getDiscount() {
        return 33;
    }

    public String getSpecialEvent() {
        return this.specialEvent;
    }

    public void setSpecialEvent(String specialEvent) {
        this.specialEvent = specialEvent;
    }
}
