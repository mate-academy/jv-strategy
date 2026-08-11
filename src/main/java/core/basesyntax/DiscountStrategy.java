package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.implament.BirthdayDiscountService;
import core.basesyntax.strategy.implament.BlackFridayDiscountService;
import core.basesyntax.strategy.implament.DefaultDiscountService;
import core.basesyntax.strategy.implament.NewYearDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "New Year":
                return new NewYearDiscountService();
            case "Birthday":
                return new BirthdayDiscountService();
            case "Black Friday":
                return new BlackFridayDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}
