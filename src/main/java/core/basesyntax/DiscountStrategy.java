package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    public static final String NEW_YEAR_STRING = "New Year";
    public static final String BIRTHDAY_STRING = "Birthday";
    public static final String BLACK_FRIDAY_STRING = "Black Friday";

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case NEW_YEAR_STRING:
                return new NewYearDiscountService();
            case BIRTHDAY_STRING:
                return new BirthdayDiscountService();
            case BLACK_FRIDAY_STRING:
                return new BlackFridayDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}
