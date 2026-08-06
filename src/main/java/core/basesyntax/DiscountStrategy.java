package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntex.strategy.iml.BirthdayDiscountService;
import core.basesyntex.strategy.iml.BlackFridayDiscountService;
import core.basesyntex.strategy.iml.DefaultDiscountService;
import core.basesyntex.strategy.iml.NewYearDiscountService;

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
