package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

import java.util.HashMap;
import java.util.Map;

public class DiscountStrategy {
    private final Map<String, DiscountService> discountStrategies;

    public DiscountStrategy() {
        discountStrategies = new HashMap<>();
        discountStrategies.put("Black Friday", new BlackFridayDiscountService());
        discountStrategies.put("New Year", new NewYearDiscountService());
        discountStrategies.put("Birthday", new BirthdayDiscountService());
    }

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        return discountStrategies.getOrDefault(specialEvent, new DefaultDiscountService());
    }
}