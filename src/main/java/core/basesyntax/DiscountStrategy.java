package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    private static final String NEW_YEAR_EVENT = "New Year";
    private static final String BIRTHDAY_EVENT = "Birthday";
    private static final String BLACK_FRIDAY_EVENT = "Black Friday";

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {

        switch (specialEvent) {
            case NEW_YEAR_EVENT: {
                return new NewYearDiscountService();
            }
            case BIRTHDAY_EVENT: {
                return new BirthdayDiscountService();
            }
            case BLACK_FRIDAY_EVENT: {
                return new BlackFridayDiscountService();
            }
            default: {
                return new DefaultDiscountService();
            }
        }
    }
}
