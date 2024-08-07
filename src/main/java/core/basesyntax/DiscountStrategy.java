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
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        if (specialEvent.equals("Birthday")) {
            return new BirthdayDiscountService();
        }
        if (specialEvent.equals("Black Friday")) {
            return new BlackFridayDiscountService();
        }
        if (specialEvent.equals("New Year")) {
            return new NewYearDiscountService();
        }
        return new DefaultDiscountService();
    }
}
