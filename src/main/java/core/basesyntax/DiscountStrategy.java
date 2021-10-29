package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "BIRTHDAY":
                return new BirthdayDiscountService();
            case "NEW_YEAR":
                return new NewYearDiscountService();
            case "BLACK_FRIDAY":
                return new BlackFridayDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}
