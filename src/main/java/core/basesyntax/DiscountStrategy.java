package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.implementation.BFDiscountService;
import core.basesyntax.strategy.implementation.BirthdayDiscoundService;
import core.basesyntax.strategy.implementation.DefaultDiscountService;
import core.basesyntax.strategy.implementation.NYDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "New Year" : return new NYDiscountService();
            case "Black Friday" : return new BFDiscountService();
            case "Birthday" : return new BirthdayDiscoundService();
            default: return new DefaultDiscountService();
        }
    }
}
