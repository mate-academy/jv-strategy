package core.basesyntax;

import core.basesyntax.strategy.BirthdayDiscountService;
import core.basesyntax.strategy.BlackFridayDiscountService;
import core.basesyntax.strategy.DefaultDiscountService;
import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.NewYearDiscountService;

public class DiscountStrategy {
    DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        return switch (specialEvent) {
            case "Birthday" -> new BirthdayDiscountService();
            case "Black Friday" -> new BlackFridayDiscountService();
            case "New Year" -> new NewYearDiscountService();
            default -> new DefaultDiscountService();
        };
    }
}
