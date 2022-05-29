package core.basesyntax;

import core.basesyntax.category.BirthdayDiscountService;
import core.basesyntax.category.BlackFridayDiscountService;
import core.basesyntax.category.DefaultDiscountService;
import core.basesyntax.category.NewYearDiscountService;
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
            default:
                return new DefaultDiscountService();
        }
    }
}
