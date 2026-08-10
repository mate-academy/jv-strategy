package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;
import java.util.HashMap;
import java.util.Map;

public class DiscountStrategy {
    private final Map<String, DiscountService> discountServiceMap;

    public DiscountStrategy() {
        discountServiceMap = new HashMap<>();
        discountServiceMap.put("Birthday", new BirthdayDiscountService());
        discountServiceMap.put("Black Friday", new BlackFridayDiscountService());
        discountServiceMap.put("New Year", new NewYearDiscountService());
    }

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        return discountServiceMap.get(specialEvent) == null ? new DefaultDiscountService()
                : discountServiceMap.get(specialEvent);
    }
}
