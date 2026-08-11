package core.basesyntax;

import core.basesyntax.strategi.DiscountService;
import core.basesyntax.strategi.impl.BirthdayDiscountService;
import core.basesyntax.strategi.impl.BlackFridayDiscountService;
import core.basesyntax.strategi.impl.DefaultDiscountService;
import core.basesyntax.strategi.impl.NewYearDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Black Friday":
                return new BlackFridayDiscountService();
            case "Birthday":
                return new BirthdayDiscountService();
            case "New Year":
                return new NewYearDiscountService();
            case "Default day":
            default:
                return new DefaultDiscountService();
        }
    }
}
