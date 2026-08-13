package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        DiscountService ds;
        switch (specialEvent) {
            case "Birthday" -> ds = new BirthdayDiscountService();
            case "Black Friday" -> ds = new BlackFridayDiscountService();
            case "New Year" -> ds = new NewYearDiscountService();
            default -> ds = new DefaultDiscountService();
        }
        return ds;
    }
}
