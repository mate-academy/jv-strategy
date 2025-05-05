package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class DiscountStrategy {
    DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "New Year": return () -> 20;
            case "Birthday": return () -> 33;
            case "Black Friday": return () -> 45;
            default: return () -> 0;
        }
    }
}
