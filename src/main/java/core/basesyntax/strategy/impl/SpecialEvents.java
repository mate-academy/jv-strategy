package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public enum SpecialEvents {
    DEFAULT("Default", new DefaultDiscountService()),
    NEW_YEAR("New Year", new NewYearDiscountService()),
    BIRTHDAY("Birthday", new BirthdayDiscountService()),
    BLACK_FRIDAY("Black Friday", new BlackFridayDiscountService());

    private final String specialEvent;
    private final DiscountService discount;

    SpecialEvents(String specialEvent, DiscountService discount) {
        this.specialEvent = specialEvent;
        this.discount = discount;
    }

    public String getSpecialEvent() {
        return specialEvent;
    }

    public DiscountService getDiscount() {
        return discount;
    }
}
