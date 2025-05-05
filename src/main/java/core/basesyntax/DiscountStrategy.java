package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    private static final String BLACK_FRIDAY_DISCOUNT = "Black Friday";
    private static final String BIRTHDAY_DISCOUNT = "Birthday";
    private static final String NEW_YEAR_DISCOUNT = "New Year";

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case BIRTHDAY_DISCOUNT:
                return new BirthdayDiscountService();
            case BLACK_FRIDAY_DISCOUNT:
                return new BlackFridayDiscountService();
            case NEW_YEAR_DISCOUNT:
                return new NewYearDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}
