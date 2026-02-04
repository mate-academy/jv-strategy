package core.basesyntax.impl;

import core.basesyntax.strategy.DiscountService;

public class DiscountStrategy {

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {

        switch (specialEvent) {
            case "Birthday":
                return new BirthdayDiscountService();
            case "Black Friday":
                return new BlackFridayService();
            case "New Year":
                return new NewYearDiscountService();
            default:
                return new DefaultDiscountService();

        }
    }
}
