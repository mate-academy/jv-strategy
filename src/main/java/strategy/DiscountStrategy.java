package strategy;

import strategy.impl.BirthdayDiscountService;
import strategy.impl.BlackFridayDiscountService;
import strategy.impl.DefaultDiscountService;
import strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        if ("Birthday".equalsIgnoreCase(specialEvent)) {
            return new BirthdayDiscountService();
        } else if ("Black Friday".equalsIgnoreCase(specialEvent)) {
            return new BlackFridayDiscountService();
        } else if ("New Year".equalsIgnoreCase(specialEvent)) {
            return new NewYearDiscountService();
        }
        return new DefaultDiscountService();
    }
}

