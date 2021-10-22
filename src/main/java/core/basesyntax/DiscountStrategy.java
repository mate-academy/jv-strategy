package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountServiceImpl;
import core.basesyntax.strategy.impl.BlackFridayDiscountServiceImpl;
import core.basesyntax.strategy.impl.DefaultDiscountServiceImpl;
import core.basesyntax.strategy.impl.NewYearDiscountServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class DiscountStrategy {
    private static final Map<String, DiscountService> instances = new HashMap<>();

    static {
        instances.put("Birthday", new BirthdayDiscountServiceImpl());
        instances.put("New Year", new NewYearDiscountServiceImpl());
        instances.put("Black Friday", new BlackFridayDiscountServiceImpl());
    }

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        if (instances.containsKey(specialEvent)) {
            return instances.get(specialEvent);
        }
        return new DefaultDiscountServiceImpl();
    }
}