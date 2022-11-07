package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case("New Year"):
                return new DiscountService() {
                    @Override
                    public double getDiscount() {
                        return 20.0;
                    }
                };
            case ("Birthday"):
                return new BirthdayDiscountService();
            case("Black Friday"):
                return new BlackFridayDiscountService();
            case("none"):
            default:
                return new DefaultDiscountService();
        }
    }
}
