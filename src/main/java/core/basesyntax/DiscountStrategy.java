package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        if ("Birthday".equals(specialEvent)) {
            return new BirthdayDiscountService();
        } else if ("Black Friday".equals(specialEvent)) {
            return new BlackFridayDiscountService();
        } else if ("New Year".equals(specialEvent)) {
            return new NewYearDiscountService();
        }
        return new DefaultDiscountService();
    }
}
