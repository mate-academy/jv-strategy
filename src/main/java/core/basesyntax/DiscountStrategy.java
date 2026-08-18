package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class DiscountStrategy {
    DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "New Year" :
                return new NewYearDiscountService();
            case "Birthday" :
                return new BirthdayDiscountService();
            case "Black Friday" :
                return new BlackFridayDiscountService();
            case "Default event" :
            default:
                return new DefaultDiscountService();
        }
    }
}
