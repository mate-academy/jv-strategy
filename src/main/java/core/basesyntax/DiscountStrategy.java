package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;
import java.util.HashMap;
import java.util.Map;

public class DiscountStrategy {
    private static final Map<String, DiscountService> discountServiceMap = new HashMap<>() {{
            put("Birthday", new BirthdayDiscountService());
            put("Black Friday", new BlackFridayDiscountService());
            put("New Year", new NewYearDiscountService());
        }};

    DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        return discountServiceMap.getOrDefault(specialEvent, new DefaultDiscountService());
    }
}
