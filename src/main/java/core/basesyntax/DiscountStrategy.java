package core.basesyntax;

import core.basesyntax.impl.BirthdayDiscountService;
import core.basesyntax.impl.BlackFridayDiscountService;
import core.basesyntax.impl.DefaultDiscountService;
import core.basesyntax.impl.NewYearDiscountService;
import core.basesyntax.strategy.DiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        BlackFridayDiscountService blackFridayDiscountService = new BlackFridayDiscountService();
        BirthdayDiscountService birthdayDiscountService = new BirthdayDiscountService();
        NewYearDiscountService newYearDiscountService = new NewYearDiscountService();
        DefaultDiscountService defaultDiscountService = new DefaultDiscountService();

        switch (specialEvent) {
            case "Black Friday":
                return blackFridayDiscountService;
            case "Birthday":
                return birthdayDiscountService;
            case "New Year":
                return newYearDiscountService;
            default:
                return defaultDiscountService;
        }
    }
}
