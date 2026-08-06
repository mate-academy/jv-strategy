package core.basesyntax;

import core.basesyntax.realisation.BirthdayDiscountService;
import core.basesyntax.realisation.BlackFridayDiscountService;
import core.basesyntax.realisation.DefaultDiscountService;
import core.basesyntax.realisation.NewYearDiscountService;
import core.basesyntax.strategy.DiscountService;

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
