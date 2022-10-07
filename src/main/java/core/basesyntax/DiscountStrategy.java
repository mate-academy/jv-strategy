package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    private final String birthday = "Birthday";
    private final String blackFridayDiscountService = "Black Friday";
    private final String newYearDiscountService = "New Year";

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case birthday:
                return new BirthdayDiscountService();
            case blackFridayDiscountService:
                return new BlackFridayDiscountService();
            case newYearDiscountService:
                return new NewYearDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}
