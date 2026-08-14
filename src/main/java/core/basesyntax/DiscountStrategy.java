package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscount;
import core.basesyntax.strategy.impl.DefaultDiscondService;
import core.basesyntax.strategy.impl.NewYearDiscount;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "New Year" :
                return new NewYearDiscount();
            case "Birthday" :
                return new BirthdayDiscountService();
            case "Black Friday" :
                return new BlackFridayDiscount();
            default:
                return new DefaultDiscondService();
        }
    }
}
