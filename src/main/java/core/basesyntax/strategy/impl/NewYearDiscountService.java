package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    private String specialEvent = "New Year";

    @Override
    public double getDiscount() {
        return 20;
    }

    public String getSpecialEvent() {
        return this.specialEvent;
    }

    public void setSpecialEvent(String specialEvent) {
        this.specialEvent = specialEvent;
    }
}
