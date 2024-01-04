package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.implementation.BfDiscountService;
import core.basesyntax.strategy.implementation.BirthdayDiscoundService;
import core.basesyntax.strategy.implementation.DefaultDiscountService;
import core.basesyntax.strategy.implementation.NyDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "New Year" : return new NyDiscountService();
            case "Black Friday" : return new BfDiscountService();
            case "Birthday" : return new BirthdayDiscoundService();
            default: return new DefaultDiscountService();
        }
    }
}
