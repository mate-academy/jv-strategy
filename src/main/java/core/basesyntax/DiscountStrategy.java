package core.basesyntax;

import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.DiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    private DiscountService defaultDiscountService = new DefaultDiscountService();
    private DiscountService newYearDiscountService = new NewYearDiscountService();
    private DiscountService birthdayDiscountService = new BirthdayDiscountService();
    private DiscountService blackFridayDiscountService = new BlackFridayDiscountService();

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "New Year": return newYearDiscountService;
            case "Birthday": return birthdayDiscountService;
            case "Black Friday": return blackFridayDiscountService;
            default: return defaultDiscountService;
        }
    }
}
