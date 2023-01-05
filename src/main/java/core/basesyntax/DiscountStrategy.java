package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    public static final String BIRTHDAY_CASE = "Birthday";
    public static final String BLACK_FRIDAY_CASE = "Black Friday";
    public static final String NEW_YEAR_CASE = "New Year";

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case BIRTHDAY_CASE: return new BirthdayDiscountService();
            case BLACK_FRIDAY_CASE: return new BlackFridayDiscountService();
            case NEW_YEAR_CASE: return new NewYearDiscountService();
            default: return new DefaultDiscountService();
        }
    }
}
