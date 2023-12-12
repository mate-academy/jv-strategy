package core.basesyntax;

import core.basesyntax.strategy.strategy.BirthdayDiscountService;
import core.basesyntax.strategy.strategy.BlackFridayDiscountService;
import core.basesyntax.strategy.strategy.DefaultDiscountService;
import core.basesyntax.strategy.strategy.NewYearDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "New Year" :
                return new NewYearDiscountService();
            case "Black Friday" :
                return new BlackFridayDiscountService();
            case "Birthday" :
                return new BirthdayDiscountService();
            default:
                return new DefaultDiscountService();

        }
    }
}
