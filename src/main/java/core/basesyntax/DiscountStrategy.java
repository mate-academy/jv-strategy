package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {

        if (specialEvent == null) {
            return new DefaultDiscountService();
        }

        specialEvent = specialEvent.trim();

        if (specialEvent.equalsIgnoreCase("Birthday")) {
            return new BirthdayDiscountService();
        } else if (specialEvent.equalsIgnoreCase("Black Friday")) {
            return new BlackFridayDiscountService();
        } else if (specialEvent.equalsIgnoreCase("New Year")) {
            return new NewYearDiscountService();
        } else {
            return new DefaultDiscountService();
        }
    }
}
