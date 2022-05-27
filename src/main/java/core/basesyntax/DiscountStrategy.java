package core.basesyntax;

import core.basesyntax.category.BirthdayDiscountService;
import core.basesyntax.category.BlackFridayDiscountService;
import core.basesyntax.category.DefaultDiscountService;
import core.basesyntax.category.NewYearDiscountService;
import core.basesyntax.strategy.DiscountService;

public class DiscountStrategy {
    private static final String NEW_YEAR = "New Year";
    private static final String BIRTHt_DATE = "Birthday";
    private static final String BLACK_FRIDAY = "Black Friday";

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case BIRTHt_DATE:
                return new BirthdayDiscountService();
            case BLACK_FRIDAY:
                return new BlackFridayDiscountService();
            case NEW_YEAR:
                return new NewYearDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }

}
