package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        return () -> 0;
    }
}
