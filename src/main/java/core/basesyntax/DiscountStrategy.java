package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    private static final String BIRTHDAY_DAY = "Birthday";
    private static final String NEW_YEAR_DAY = "New Year";
    private static final String BLACK_FRIDAY_DAY = "Black Friday";

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case BIRTHDAY_DAY:
                return new BirthdayDiscountService();
            case BLACK_FRIDAY_DAY:
                return new BlackFridayDiscountService();
            case NEW_YEAR_DAY:
                return new NewYearDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}
