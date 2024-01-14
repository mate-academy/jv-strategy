package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.implementation.BlackFridayDiscount;
import core.basesyntax.strategy.implementation.DefaultDiscount;
import core.basesyntax.strategy.implementation.HappyBirthdayDiscount;
import core.basesyntax.strategy.implementation.NewYearDiscount;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Black Friday" : return new BlackFridayDiscount();
            case "Birthday" : return new HappyBirthdayDiscount();
            case "New Year" : return new NewYearDiscount();
            default: return new DefaultDiscount();
        }
    }
}
