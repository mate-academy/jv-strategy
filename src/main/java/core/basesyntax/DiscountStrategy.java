package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        if ("Birthday".equalsIgnoreCase(specialEvent)) {
            return new BirthdayDiscountService();
        } else if ("Black Friday".equalsIgnoreCase(specialEvent)) {
            return new BlackFridayDiscountService();
        } else if ("New Year".equalsIgnoreCase(specialEvent)) {
            return new NewYearDiscountService();
        }
        return new DefaultDiscountService();
    }
}
