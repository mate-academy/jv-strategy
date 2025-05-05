package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;
import java.util.HashMap;

public class DiscountStrategy {
    public static final String EVENT_BIRTHDAY = "Birthday";
    public static final String EVENT_BLACK_FRIDAY = "Black Friday";
    public static final String EVENT_NEW_YEAR = "New Year";
    private final HashMap<String, DiscountService> services = new HashMap<>();
    private final DefaultDiscountService defaultService = new DefaultDiscountService();

    public DiscountStrategy() {
        services.put(EVENT_BIRTHDAY, new BirthdayDiscountService());
        services.put(EVENT_BLACK_FRIDAY, new BlackFridayDiscountService());
        services.put(EVENT_NEW_YEAR, new NewYearDiscountService());
    }

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        return services.getOrDefault(specialEvent, defaultService);
    }
}
