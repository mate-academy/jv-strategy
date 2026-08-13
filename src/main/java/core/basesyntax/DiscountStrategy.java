package core.basesyntax;

import strategy.DiscountService;
import strategy.impl.BirthdayDiscountService;
import strategy.impl.BlackFridayDiscountService;
import strategy.impl.DefaultDiscountService;
import strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    public static DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
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
