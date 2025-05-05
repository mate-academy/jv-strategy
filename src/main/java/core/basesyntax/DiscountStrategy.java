package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    private final String blackFriday = "Black Friday";
    private final String newYear = "New Year";
    private final String birthday = "Birthday";

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        return switch (specialEvent) {
            case blackFriday -> new BlackFridayDiscountService();
            case newYear -> new NewYearDiscountService();
            case birthday -> new BirthdayDiscountService();
            default -> new DefaultDiscountService();
        };
    }
}
