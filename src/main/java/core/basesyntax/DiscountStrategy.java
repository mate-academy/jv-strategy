package core.basesyntax;

import core.basesyntax.imp.BirthdayDiscountService;
import core.basesyntax.imp.BlackFridayDiscountService;
import core.basesyntax.imp.DefaultDiscountService;
import core.basesyntax.imp.NewYearDiscountService;
import core.basesyntax.strategy.DiscountService;

public class DiscountStrategy {
    private static final String BIRTHDAY = "Birthday";
    private static final String BLACK_FRIDAY = "Black Friday";
    private static final String DEFAULT = "default";
    private static final String NEW_YEAR = "New Year";

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        return switch (getValidatedSpecialEvent(specialEvent)) {
            case BIRTHDAY -> new BirthdayDiscountService();
            case BLACK_FRIDAY -> new BlackFridayDiscountService();
            case NEW_YEAR -> new NewYearDiscountService();
            default -> new DefaultDiscountService();
        };
    }

    private boolean isDiscountExist(String specialEvent) {
        if (specialEvent == null) {
            return false;
        }
        return specialEvent.equals(BIRTHDAY)
                || specialEvent.equals(BLACK_FRIDAY)
                || specialEvent.equals(DEFAULT)
                || specialEvent.equals(NEW_YEAR);
    }

    private String getValidatedSpecialEvent(String specialEvent) {
        if (!isDiscountExist(specialEvent)) {
            return DEFAULT;
        }
        return specialEvent;
    }
}
