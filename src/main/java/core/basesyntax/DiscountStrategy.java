package core.basesyntax;

import core.basesyntax.discount.BirthdayDiscountService;
import core.basesyntax.discount.BlackFridayDiscountService;
import core.basesyntax.discount.DefaultDiscountService;
import core.basesyntax.discount.NewYearDiscountService;
import core.basesyntax.strategy.DiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Birthday":
                return new BirthdayDiscountService();
            case "Black Friday":
                return new BlackFridayDiscountService();
            case "New Year":
                return new NewYearDiscountService();
            case "Default":
            default:
                return new DefaultDiscountService();
        }
    }
}
