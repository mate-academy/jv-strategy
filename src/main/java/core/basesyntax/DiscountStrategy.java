package core.basesyntax;

import core.basesyntax.strategy.iml.BirthdayDiscountService;
import core.basesyntax.strategy.iml.BlackFridayDiscountService;
import core.basesyntax.strategy.iml.DefaultDiscountService;
import core.basesyntax.strategy.iml.NewYearDiscountService;

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
