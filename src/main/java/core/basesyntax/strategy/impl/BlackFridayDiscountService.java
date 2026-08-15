package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    private String specialEvent = "BlackFriday";

    @Override
    public double getDiscount() {
        return 45;
    }

    public String getSpecialEvent() {
        return this.specialEvent;
    }

    public void setSpecialEvent(String specialEvent) {
        this.specialEvent = specialEvent;
    }
}
