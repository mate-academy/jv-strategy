package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    private static final String NEW_YEAR = "New Year";
    private static final String BIRTHDAY = "Birthday";
    private static final String BLACK_FRIDAY = "Black Friday";

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case NEW_YEAR:
                return new NewYearDiscountService();
            case BIRTHDAY:
                return new BirthdayDiscountService();
            case BLACK_FRIDAY:
                return new BlackFridayDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}
