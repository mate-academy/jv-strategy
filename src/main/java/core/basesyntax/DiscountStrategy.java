package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        if ("New Year".equals(specialEvent)) {
            return new core.basesyntax.strategy.impl.NewYearDiscountService();
        } else if ("Birthday".equals(specialEvent)) {
            return new core.basesyntax.strategy.impl.BirthdayDiscountService();
        } else if ("Black Friday".equals(specialEvent)) {
            return new core.basesyntax.strategy.impl.BlackFridayDiscountService();
        } else {
            return new core.basesyntax.strategy.impl.DefaultDiscountService();
        }
    }
}
