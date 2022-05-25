package core.basesyntax;

import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

/**
 * Feel free to remove this class and create your own.
 */
public class DiscountStrategy {

    public double getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Birthday":
                return new BirthdayDiscountService().getDiscount();
            case "Black Friday":
                return new BlackFridayDiscountService().getDiscount();
            case "New Year":
                return new NewYearDiscountService().getDiscount();

            default:
                return new DefaultDiscountService().getDiscount();
        }
    }
}
