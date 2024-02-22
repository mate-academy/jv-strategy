package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        return switch (specialEvent) {
            case "New Year" -> new NewYearDiscountService();
            case "Black Friday" -> new BlackFridayDiscountService();
            case "Birthday" -> new BirthdayDiscountService();
            default -> new DefaultDiscountService();
        };
    }
}
