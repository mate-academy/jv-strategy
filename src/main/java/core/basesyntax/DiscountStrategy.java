package core.basesyntax;

import core.basesyntax.strategy.DiscountService.java;
import core.basesyntax.strategy.impl.BirthdayDiscountService.java;
import core.basesyntax.strategy.impl.BlackFridayDiscountService.java;
import core.basesyntax.strategy.impl.NewYearDiscountService.java;
import core.basesyntax.strategy.impl.DefaultDiscountService.java;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Birthday":
                return new BirthdayDiscountService();
            case "Black Friday":
                return new BlackFridayDiscountService();
            case "New Year":
                return new NewYearDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}
