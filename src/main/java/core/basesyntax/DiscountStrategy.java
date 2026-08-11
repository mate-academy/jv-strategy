package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.Birthday;
import core.basesyntax.strategy.impl.BlackFriday;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYear;

/**
 * Feel free to remove this class and create your own.
 */
public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Birthday":
                return new Birthday();
            case "Black Friday":
                return new BlackFriday();
            case "New Year":
                return new NewYear();
            case "Default event":
            default:
                return new DefaultDiscountService();
        }
    }

}
