package core.basesyntax;

import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    public DiscountStrategy getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Birthday":
                return new BirthdayDiscountService();
            case "New Year":
                return new NewYearDiscountService();
            case "Black Friday":
                return new BlackFridayDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }

    public double getDiscount() {
        return 0;
    }
}
