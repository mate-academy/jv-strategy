package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class DiscountStrategy {

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Birthday" : return new BirthdayDiscountService();
            case "Black Friday" : return new BlackfridayDiscountService();
            case "New Year" : return new NewyearDiscountService();
            default : return new DefaultDiscountService();
        }
    }
}
