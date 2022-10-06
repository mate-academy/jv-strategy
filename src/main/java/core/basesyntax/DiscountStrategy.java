package core.basesyntax;

import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.DiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    static final String[] EVENTS = {"Birthday", "Black Friday", "New Year"};

    DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Birthday": return new BirthdayDiscountService();
            case "Black Friday": return new BlackFridayDiscountService();
            case "New Year": return new NewYearDiscountService();
            default: return new DefaultDiscountService();
        }
    }
}
