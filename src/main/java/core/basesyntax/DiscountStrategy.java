package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        return specialEvent.equals("Birthday") ? new BirthdayDiscountService()
                : specialEvent.equals("Black Friday") ? new BlackFridayDiscountService()
                : specialEvent.equals("New Year") ? new NewYearDiscountService()
                : new DefaultDiscountService();
    }
}
