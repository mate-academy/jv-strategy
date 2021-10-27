package core.basesyntax;

import core.basesyntax.strategy.impl.*;
import core.basesyntax.strategy.DiscountService;

public class DiscountStrategy {
    private static final String EVENT_NEW_YEAR = "New Year";
    private static final String EVENT_BLACK_FRIDAY = "Black Friday";
    private static final String EVENT_BIRTHDAY = "Birthday";

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case EVENT_NEW_YEAR:
                return new NewYearDiscountService();
            case EVENT_BIRTHDAY:
                return new BirthdayDiscountService();
            case EVENT_BLACK_FRIDAY:
                return new BlackFridayDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}
