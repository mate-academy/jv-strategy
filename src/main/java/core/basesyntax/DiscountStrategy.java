package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.implementation.BirthdayDiscountService;
import core.basesyntax.strategy.implementation.BlackFridayDiscountService;
import core.basesyntax.strategy.implementation.DefaultDiscountService;
import core.basesyntax.strategy.implementation.NewYearDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Black Friday" :
                return new BlackFridayDiscountService();
            case "New Year" :
                return new NewYearDiscountService();
            case "Birthday" :
                return new BirthdayDiscountService();
            default :
                return new DefaultDiscountService();
        }
    }
}
