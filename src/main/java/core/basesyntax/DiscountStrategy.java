package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.Birthday;
import core.basesyntax.strategy.impl.BlackFriday;
import core.basesyntax.strategy.impl.Default;
import core.basesyntax.strategy.impl.NewYear;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Birthday":
                return new Birthday();
            case "Black Friday":
                return new BlackFriday();
            case "New Year":
                return new NewYear();
            default:
                return new Default();
        }
    }
}
