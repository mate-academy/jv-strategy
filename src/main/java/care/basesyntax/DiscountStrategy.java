package care.basesyntax;

import care.basesyntax.strategy.DiscountService;
import care.basesyntax.strategy.imp.BirthdayDiscountService;
import care.basesyntax.strategy.imp.BlackFridayDiscountService;
import care.basesyntax.strategy.imp.DefaultDiscountService;
import care.basesyntax.strategy.imp.NewYearDiscountService;

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
