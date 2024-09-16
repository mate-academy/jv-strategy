package core.basesyntax;

import core.basesyntax.impl.BirthdayDiscountService;
import core.basesyntax.impl.BlackFridayDiscountService;
import core.basesyntax.impl.DefaultDiscountService;
import core.basesyntax.impl.NewYearDiscountService;
import core.basesyntax.strategy.DiscountService;

public class DiscountStrategy {
    private static final String BIRTHDAY = "Birthday";
    private static final String BLACK_FRIDAY = "Black Friday";
    private static final String NEW_YEAR = "New Year";

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        return switch (specialEvent) {
            case BIRTHDAY -> new BirthdayDiscountService();
            case BLACK_FRIDAY -> new BlackFridayDiscountService();
            case NEW_YEAR -> new NewYearDiscountService();
            default -> new DefaultDiscountService();
        };
    }
}
