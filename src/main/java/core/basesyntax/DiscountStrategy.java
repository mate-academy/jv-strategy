package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.SpecialEvents;

public class DiscountStrategy {
    private SpecialEvents[] specialDays = SpecialEvents.values();

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        for (SpecialEvents specialDay: specialDays) {
            if (specialDay.getSpecialEvent().equals(specialEvent)) {
                return specialDay.getDiscount();
            }
        }
        return SpecialEvents.DEFAULT.getDiscount();
    }
}
