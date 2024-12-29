package core.basesyntax;

import core.basesyntax.impl.BirthdayDiscountService;
import core.basesyntax.impl.BlackFridayDiscountService;
import core.basesyntax.impl.DefaultDiscountService;
import core.basesyntax.impl.NewYearDiscountService;

public class DiscountStrategy {

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        if (specialEvent.equals("Birthday")) {
            return new BirthdayDiscountService();
        }
        if (specialEvent.equals("Black Friday")) {
            return new BlackFridayDiscountService ();
        }
        if (specialEvent.equals("New Year")) {
            return new NewYearDiscountService ();
        }
        return new DefaultDiscountService();
    }
}
