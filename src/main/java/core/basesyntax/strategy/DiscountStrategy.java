package core.basesyntax.strategy;

import core.basesyntax.BirthdayDiscountService;
import core.basesyntax.BlackFridayDiscountService;
import core.basesyntax.DefaultDiscountService;
import core.basesyntax.NewYearDiscountService;
import core.basesyntax.strategy.impl.DiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case ("New Year"):
                return new NewYearDiscountService();
            case ("Birthday"):
                return new BirthdayDiscountService();
            case ("Black Friday"):
                return new BlackFridayDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}
