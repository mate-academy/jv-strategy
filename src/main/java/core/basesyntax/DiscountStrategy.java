package core.basesyntax;

import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    public NewYearDiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch(specialEvent) {
            case("New Year"):
                return new NewYearDiscountService();
            case ("Birthday"):
                return new BirthdayDiscountService();
            case("BlackFriday"):
                return new BlackFridayDiscountService();
            case("none"):
            default:
                return new DefaultDiscountService();
        }
    }
}
