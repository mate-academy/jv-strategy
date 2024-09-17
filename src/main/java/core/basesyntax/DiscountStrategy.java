package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Default event":
                return () -> 0;
            case "Birthday":
                return () -> 33;
            case "Black Friday":
                return () -> 45;
            case "New Year":
                return () -> 20;
            default:
                throw new RuntimeException();
        }
    }
}
