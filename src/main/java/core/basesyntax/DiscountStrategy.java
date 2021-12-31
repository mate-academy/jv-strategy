package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {

    public static final String BIRTHDAY = "Birthday";
    public static final String NEW_YEAR = "New Year";
    public static final String BLACK_FRIDAY = "Black Friday";

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case BIRTHDAY: {
                return (DiscountService) new BirthdayDiscountService();
            }
            case NEW_YEAR: {
                return (DiscountService) new NewYearDiscountService();
            }
            case BLACK_FRIDAY: {
                return (DiscountService) new BlackFridayDiscountService();
            }
            default: {
                return (DiscountService) new DefaultDiscountService();
            }
        }
    }
}
