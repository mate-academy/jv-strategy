package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    private final static String BIRTHDAY_EVENT = "Birthday";
    private final static String BLACK_FRIDAY_EVENT = "Black Friday";
    private final static String NEW_YEAR_EVENT = "New Year";

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case BIRTHDAY_EVENT:
                return new BirthdayDiscountService();
            case BLACK_FRIDAY_EVENT:
                return new BlackFridayDiscountService();
            case NEW_YEAR_EVENT:
                return new NewYearDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}
