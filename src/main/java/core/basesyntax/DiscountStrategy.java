package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.imp.BirthdayDiscountService;
import core.basesyntax.strategy.imp.BlackFridayDiscountService;
import core.basesyntax.strategy.imp.DefaultDiscountService;
import core.basesyntax.strategy.imp.NewYearDiscountService;

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
