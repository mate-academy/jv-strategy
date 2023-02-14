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
    DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "New Year":
                return new NewYearDiscountService();
            case "Black Friday":
                return new BlackFridayDiscountService();
            case "Birthday":
                return new BirthdayDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }

}
