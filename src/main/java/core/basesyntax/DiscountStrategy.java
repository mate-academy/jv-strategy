package core.basesyntax;

import core.basesyntax.impl.BirthdayDiscountService;
import core.basesyntax.impl.BlackFridayDiscountService;
import core.basesyntax.impl.DefaultDiscountService;
import core.basesyntax.impl.NewYearDiscountService;

public class DiscountStrategy {
    DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Birthday":
                return new BirthdayDiscountService();
            case ("Black Friday"):
                return new BlackFridayDiscountService();
            case ("New Year"):
                return new NewYearDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}
