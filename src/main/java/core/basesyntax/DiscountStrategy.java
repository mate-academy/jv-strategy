package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

/**
 * @version 1.0
 * @autor Denys.Shl
 * @created by 09/03/2022 - 12:25
 * @project strategy
 */
public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent.toUpperCase().replaceAll(" ", "")) {
            case "BIRTHDAY":
                return new BirthdayDiscountService();
            case "NEWYEAR":
                return new NewYearDiscountService();
            case "BLACKFRIDAY":
                return new BlackFridayDiscountService();

            default:
                return new DefaultDiscountService();
        }
    }
}
