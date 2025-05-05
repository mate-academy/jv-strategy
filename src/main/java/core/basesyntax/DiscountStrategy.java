package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

/**
 * Feel free to remove this class and create your own.
 */
public class DiscountStrategy {
    DiscountService getDiscountServiceBySpecialEvent(String specialEcent) {
        return switch (specialEcent) {
            case "Birthday" -> new BirthdayDiscountService();
            case "Black Friday" -> new BlackFridayDiscountService();
            case "New Year" -> new NewYearDiscountService();
            default -> new DefaultDiscountService();
        };

    }
}

