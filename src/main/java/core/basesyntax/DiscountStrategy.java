package core.basesyntax;

import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        return "Birthday".equals(specialEvent) ? new BirthdayDiscountService() :
                "Black Friday".equals(specialEvent) ? new BlackFridayDiscountService() :
                        "New Year".equals(specialEvent) ? new NewYearDiscountService() :
                                new DefaultDiscountService();
    }
}
