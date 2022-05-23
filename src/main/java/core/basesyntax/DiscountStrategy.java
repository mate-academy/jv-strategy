package core.basesyntax;

import strategy.DiscountService;
import strategy.impl.BirthdayDiscountService;
import strategy.impl.BlackFridayDiscountService;
import strategy.impl.DefaultDiscountService;
import strategy.impl.NewYearDiscountService;

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
