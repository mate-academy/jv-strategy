package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscount;
import core.basesyntax.strategy.impl.BlackFridayDiscount;
import core.basesyntax.strategy.impl.DefaultDiscount;
import core.basesyntax.strategy.impl.NewYearDiscount;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Birthday":
                return new BirthdayDiscount();
            case "Black Friday":
                return new BlackFridayDiscount();
            case "New Year":
                return new NewYearDiscount();
            default:
                return new DefaultDiscount();
        }
    }
}
