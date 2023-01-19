package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;
import java.util.HashMap;

public class DiscountStrategy {
    private final HashMap<String, DiscountService> events = new HashMap<>();

    public DiscountStrategy() {
        events.put("Default", new DefaultDiscountService());
        events.put("Birthday", new BirthdayDiscountService());
        events.put("Black Friday", new BlackFridayDiscountService());
        events.put("New Year", new NewYearDiscountService());
    }

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        if (events.containsKey(specialEvent)) {
            return events.get(specialEvent);
        }
        return events.get("Default");
    }
}
