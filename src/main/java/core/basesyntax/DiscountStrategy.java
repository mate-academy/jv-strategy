package core.basesyntax;

import core.basesyntax.strategy.BirthdayDiscountService;
import core.basesyntax.strategy.BlackFridayDiscountService;
import core.basesyntax.strategy.DefaultDiscountService;
import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.NewYearDiscountService;

public class DiscountStrategy {

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        return switch (specialEvent) {
            case "Black Friday" -> new BlackFridayDiscountService();
            case "Birthday" -> new BirthdayDiscountService();
            case "New Year" -> new NewYearDiscountService();
            default -> new DefaultDiscountService();
        };
    }
}
