package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    private static final double PRICE = 100.0;

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Birthday":
                return new BirthdayDiscountService(PRICE);
            case "Black Friday":
                return new BlackFridayDiscountService(PRICE);
            case "New Year":
                return new NewYearDiscountService(PRICE);
            default:
                return new DefaultDiscountService(PRICE);
        }
    }
}
