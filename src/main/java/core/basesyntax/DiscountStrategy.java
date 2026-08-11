package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        DiscountService service;
        switch (specialEvent) {
            case "Birthday":
                service = new BirthdayDiscountService();
                break;
            case "New Year":
                service = new NewYearDiscountService();
                break;
            case "Black Friday":
                service = new BlackFridayDiscountService();
                break;
            default:
                service = new DefaultDiscountService();
                break;
        }
        return service;
    }
}
