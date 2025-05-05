package core.basesyntax;

import core.basesyntax.strategy.BirthdayDiscountService;
import core.basesyntax.strategy.BlackFridayDiscountService;
import core.basesyntax.strategy.DefaultDiscountService;
import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.NewYearDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Default event" :
            default :
                return new DefaultDiscountService();
            case "New Year" :
                return new NewYearDiscountService();
            case "Birthday" :
                return new BirthdayDiscountService();
            case "Black Friday" :
                return new BlackFridayDiscountService();
        }
    }
}
