package core.basesyntax;

import core.basesyntax.startegy.impl.BirthdayDiscountService;
import core.basesyntax.startegy.impl.BlackFridayDiscountService;
import core.basesyntax.startegy.impl.DefaultDiscountService;
import core.basesyntax.startegy.impl.NewYearDiscountService;
import core.basesyntax.strategy.DiscountService;

public class DiscountStrategy {
    DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Birthday": return new BirthdayDiscountService();
            case "Black Friday": return new BlackFridayDiscountService();
            case "New Year": return new NewYearDiscountService();
            default: return new DefaultDiscountService();
        }
    }
}
