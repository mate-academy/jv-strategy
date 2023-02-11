package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;
import java.util.Arrays;
import java.util.List;

public class DiscountStrategy {
    private final String[] specialEvent = {"Birthday", "Black Friday", "New Year"};
    private final List<String> services;

    public DiscountStrategy() {
        this.services = Arrays.asList(specialEvent);
    }

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        try {
            var event = services.indexOf(specialEvent);
            switch (event) {
                case 0:
                    return new BirthdayDiscountService();
                case 1:
                    return new BlackFridayDiscountService();
                case 2:
                    return new NewYearDiscountService();
                default:
                    return new DefaultDiscountService();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}
