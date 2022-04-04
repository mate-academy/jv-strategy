package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayService;
import core.basesyntax.strategy.impl.BlackFridayService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Birthday" : return new BirthdayService();
            case "Black Friday" : return new BlackFridayService();
            case "New Year" : return new NewYearService();
            default: return new DefaultDiscountService();
        }
    }
}
