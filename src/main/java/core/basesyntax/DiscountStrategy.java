package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;
import java.util.HashMap;
import java.util.Map;

public class DiscountStrategy {
    private Map<String, DiscountService> discountServices;

    public DiscountStrategy() {
        discountServices = new HashMap<>();
        discountServices.put("Birthday", new BirthdayDiscountService());
        discountServices.put("Black Friday", new BlackFridayDiscountService());
        discountServices.put("New Year", new NewYearDiscountService());
        discountServices.put("Default event", new DefaultDiscountService());
    }

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        return discountServices.getOrDefault(specialEvent,
                discountServices.get("Default event"));
    }
}
