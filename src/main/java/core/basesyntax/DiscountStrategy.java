package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {

    private final DiscountService birthdayDiscountService;
    private final DiscountService blackFridayDiscountService;
    private final DiscountService newYearDiscountService;
    private final DiscountService defaultDiscountService;

    public DiscountStrategy() {
        this.birthdayDiscountService = new BirthdayDiscountService();
        this.blackFridayDiscountService = new BlackFridayDiscountService();
        this.newYearDiscountService = new NewYearDiscountService();
        this.defaultDiscountService = new DefaultDiscountService();
    }

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        return switch (specialEvent) {
            case "Birthday" -> birthdayDiscountService;
            case "Black Friday" -> blackFridayDiscountService;
            case "New Year" -> newYearDiscountService;
            default -> defaultDiscountService;
        };
    }
}
