package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case ("Birthday"):
                DiscountService birthday = new BirthdayDiscountService();
                return birthday;
            case ("New Year"):
                DiscountService newYear = new NewYearDiscountService();
                return newYear;
            case ("Black Friday"):
                DiscountService blackFriday = new BlackFridayDiscountService();
                return blackFriday;
            default:
                DiscountService defaultDiscount = new DefaultDiscountService();
                return defaultDiscount;
        }
    }
}
