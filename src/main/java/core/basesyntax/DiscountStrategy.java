package core.basesyntax;

import core.basesyntax.impl.BirthdayDiscountService;
import core.basesyntax.impl.BlackFridayDiscountService;
import core.basesyntax.impl.DefaultDiscountService;
import core.basesyntax.impl.NewYearDiscountService;
import core.basesyntax.strategy.DiscountService;

public class DiscountStrategy {

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        DiscountService service;
        switch (specialEvent) {
            case "Birthday" -> service = new BirthdayDiscountService();
            case "Black Friday" -> service = new BlackFridayDiscountService();
            case "New Year" -> service = new NewYearDiscountService();
            default -> service = new DefaultDiscountService();
        }
        return service;
    }
}
