package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

import java.util.HashMap;
import java.util.Map;

public class DiscountStrategy {
    private final Map<String, DiscountService> discountServices = new HashMap<>();

    public DiscountStrategy() {
        discountServices.put("Birthday", new BirthdayDiscountService());
        discountServices.put("Black Friday", new BlackFridayDiscountService());
        discountServices.put("New Year", new NewYearDiscountService());
        discountServices.put("Default", new DefaultDiscountService());
    }

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        return discountServices.getOrDefault(specialEvent, new DefaultDiscountService());
    }
}



