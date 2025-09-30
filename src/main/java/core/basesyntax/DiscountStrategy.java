package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    private static final DiscountService DEFAULT = new DefaultDiscountService();

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        if (specialEvent == null) {
            return DEFAULT;
        }

        String key = specialEvent.trim().toLowerCase();

        switch (key) {
            case "birthday":
                return new BirthdayDiscountService();
            case "black friday":
                return new BlackFridayDiscountService();
            case "new year":
                return new NewYearDiscountService();
            default:
                return DEFAULT;
        }
    }
}
