package core.basesyntax;

import core.basesyntax.impl.BirthdayDiscountService;
import core.basesyntax.impl.BlackFridayDiscountService;
import core.basesyntax.impl.DefaultDiscountService;
import core.basesyntax.impl.NewYearDiscountService;
import core.basesyntax.strategy.DiscountService;

public class DiscountStrategy {
    private static final String BIRTHDAY_CASE = "Birthday";
    private static final String BLACK_FRIDAY_CASE = "Black Friday";
    private static final String NEW_YEAR_CASE = "New Year";

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case BIRTHDAY_CASE:
                return new BirthdayDiscountService();
            case BLACK_FRIDAY_CASE:
                return new BlackFridayDiscountService();
            case NEW_YEAR_CASE:
                return new NewYearDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}
