package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        if (specialEvent.equals("Birthday")) {
            return new BirthdayDiscountService();
        } else if (specialEvent.equals("Black Friday")) {
            return new BlackFridayDiscountService();
        } else if (specialEvent.equals("New Year")) {
            return new NewYearDiscountService();
        }
        return new DefaultDiscountService();
    }
}
