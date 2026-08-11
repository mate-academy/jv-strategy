package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.imlp.BirthdayDiscountService;
import core.basesyntax.strategy.imlp.BlackFridayDiscountService;
import core.basesyntax.strategy.imlp.DefaultDiscountService;
import core.basesyntax.strategy.imlp.NewYearDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        return switch (specialEvent) {
            case "Birthday" -> new BirthdayDiscountService();
            case "New Year" -> new NewYearDiscountService();
            case "Black Friday" -> new BlackFridayDiscountService();
            default -> new DefaultDiscountService();
        };
    }
}
