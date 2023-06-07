package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        if (specialEvent.equalsIgnoreCase("Birthday")) {
            return new BirthdayDiscountService();
        } if (specialEvent.equalsIgnoreCase("Black Friday")) {
            return new BlackFridayDiscountService();
        } if (specialEvent.equalsIgnoreCase("New Year")) {
            return new NewYearDiscountService();
        } else {
            return new DefaultDiscountService();
        }
    }
}
