package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;
import java.util.Map;

public class DiscountStrategy {
    private final Map<String, DiscountService> eventDiscountMap = Map.of(
            "Birthday", new BirthdayDiscountService(),
            "Black Friday", new BlackFridayDiscountService(),
            "New Year", new NewYearDiscountService());

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        return eventDiscountMap.getOrDefault(specialEvent, new DefaultDiscountService());
    }
}
