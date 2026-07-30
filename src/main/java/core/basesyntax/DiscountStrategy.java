package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;
import java.util.Map;
import java.util.Objects;

public class DiscountStrategy {
    private final Map<String, DiscountService> discountServices;
    private final DiscountService defaultDiscountService;

    public DiscountStrategy() {
        this(Map.of(
                "Birthday", new BirthdayDiscountService(),
                "Black Friday", new BlackFridayDiscountService(),
                "New Year", new NewYearDiscountService()
        ), new DefaultDiscountService());
    }

    public DiscountStrategy(Map<String, DiscountService> discountServices,
            DiscountService defaultDiscountService) {
        this.discountServices = Objects.requireNonNull(discountServices);
        this.defaultDiscountService = Objects.requireNonNull(defaultDiscountService);
    }

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        if (specialEvent == null) {
            return defaultDiscountService;
        }
        return discountServices.getOrDefault(specialEvent, defaultDiscountService);
    }
}
