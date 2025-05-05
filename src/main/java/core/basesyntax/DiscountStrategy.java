package core.basesyntax;

import core.basesyntax.strategy.BirthdayDiscountService;
import core.basesyntax.strategy.BlackFridayDiscountService;
import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.NewYearDiscountService;

public class DiscountStrategy {

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Birthday" :
                return new BirthdayDiscountService();
            case "Black Friday" :
                return new BlackFridayDiscountService();
            case "New Year" :
                return new NewYearDiscountService();
            default: return new DefaultDiscountService();
        }
    }
}

