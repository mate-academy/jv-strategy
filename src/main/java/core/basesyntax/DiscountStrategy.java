package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.implementation.BirthdayDiscountService;
import core.basesyntax.strategy.implementation.BlackFridayDiscountService;
import core.basesyntax.strategy.implementation.DefaultDiscountService;
import core.basesyntax.strategy.implementation.NewYearDiscountService;

public class DiscountStrategy {

    DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "New Year" :
                return new NewYearDiscountService();
            case "Birthday" :
                return new BirthdayDiscountService();
            case "Black Friday" :
                return new BlackFridayDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}
