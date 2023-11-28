package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Birthday":
                BirthdayDiscountService birthdayDiscountService = new BirthdayDiscountService();
                return birthdayDiscountService;
            case "Black Friday":
                BlackFridayDiscountService blackFridayDiscountService
                                   = new BlackFridayDiscountService();
                return blackFridayDiscountService;
            case "New Year":
                NewYearDiscountService newYearDiscountService = new NewYearDiscountService();
                return newYearDiscountService;
            default:
                DefaultDiscountService defaultDiscountService = new DefaultDiscountService();
                return defaultDiscountService;
        }

    }
}
