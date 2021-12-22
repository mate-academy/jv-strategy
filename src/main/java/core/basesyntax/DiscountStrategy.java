package core.basesyntax;

import core.basesyntax.stradegy.DiscountService;
import core.basesyntax.stradegy.impl.BirthdayDiscountService;
import core.basesyntax.stradegy.impl.BlackFridayDiscountService;
import core.basesyntax.stradegy.impl.DefaultDiscountService;
import core.basesyntax.stradegy.impl.NewYearDiscountService;

public class DiscountStrategy {

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case ("New Year"):
                return new NewYearDiscountService();
            case ("Birthday"):
                return new BirthdayDiscountService();
            case ("Black Friday"):
                return new BlackFridayDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}
