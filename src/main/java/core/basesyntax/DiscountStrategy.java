package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    DiscountService service;

    DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Birthday" -> service = new BirthdayDiscountService();
            case "Black Friday" -> service = new BlackFridayDiscountService();
            case "New Year" -> service = new NewYearDiscountService();
            default -> service = new DefaultDiscountService();
        }
        return service;
    }
}
