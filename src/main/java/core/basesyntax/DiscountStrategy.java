package core.basesyntax;

import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    public double getDiscountServiceBySpecialEvent(String specialEvent) {
        return switch (specialEvent) {
            case "Birthday" -> new BirthdayDiscountService().getDiscount();
            case "Black Friday" -> new BlackFridayDiscountService().getDiscount();
            case "New Year" -> new NewYearDiscountService().getDiscount();
            default -> new DefaultDiscountService().getDiscount();
        };
    }
}
