package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.iml.BirthdayDiscountService;
import core.basesyntax.strategy.iml.BlackFridayDiscountService;
import core.basesyntax.strategy.iml.DefaultDiscountService;
import core.basesyntax.strategy.iml.NewYearDiscountService;

public class DiscountStrategy {
    DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        return switch (specialEvent) {
            case ("Birthday") -> new BirthdayDiscountService();
            case ("Black Friday") -> new BlackFridayDiscountService();
            case ("New Year") -> new NewYearDiscountService();
            default -> new DefaultDiscountService();
        };
    }
}
