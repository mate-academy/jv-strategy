package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        DiscountService discountService;
        switch (specialEvent) {
            case "Birthday":
                discountService = new BirthdayDiscountService();
                return discountService;
            case "New Year":
                discountService = new NewYearDiscountService();
                return discountService;
            case "Black Friday":
                discountService = new BlackFridayDiscountService();
                return discountService;
            default:
                discountService = new DefaultDiscountService();
                return discountService;
        }
    }
}
