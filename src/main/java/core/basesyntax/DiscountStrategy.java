package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.iml.BirthdayDiscountService;
import core.basesyntax.strategy.iml.BlackFridayDiscountService;
import core.basesyntax.strategy.iml.DefaultDiscountService;
import core.basesyntax.strategy.iml.NewYearDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "New Year":
                return new NewYearDiscountService();
            case "Birthday":
                return new BirthdayDiscountService();
            case "Black Friday":
                return new BlackFridayDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}
