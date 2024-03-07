package core.basesyntax;

import core.basesyntax.impl.BirthdayDiscountService;
import core.basesyntax.impl.BlackFridayDiscountService;
import core.basesyntax.impl.DefaultDiscountService;
import core.basesyntax.impl.NewYearDiscountService;
import core.basesyntax.strategy.DiscountService;

public class DiscountStrategy {
    private static final String NEW_YEAR = "New Year";
    private static final String BLACK_FRIDAY = "Black Friday";
    private static final String HAPPY_DIRTHDAY = "Birthday";

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch(specialEvent) {
            case NEW_YEAR -> {
                return new NewYearDiscountService();
            }
            case BLACK_FRIDAY -> {
                return new BlackFridayDiscountService();
            }
            case HAPPY_DIRTHDAY -> {
                return  new BirthdayDiscountService();
            }
            default -> {
                return new DefaultDiscountService();
            }
        }
    }
}
