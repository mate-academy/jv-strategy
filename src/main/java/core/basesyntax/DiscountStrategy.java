package core.basesyntax;

import core.basesyntax.strategy.BlackFridayDiscountService;
import core.basesyntax.strategy.DefaultDiscountService;
import core.basesyntax.strategy.DefaultDiscountService.BirthdayDiscountService;
import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.NewYearDiscountService;

public class DiscountStrategy {
    public DiscountStrategy() {

    }

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Black Friday":
                return new BlackFridayDiscountService();
            case "Birthday":
                return new BirthdayDiscountService();
            case "New Year":
                return new NewYearDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}
