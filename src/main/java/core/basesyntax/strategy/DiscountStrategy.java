package core.basesyntax.strategy;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public  class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        if ("New Year".equalsIgnoreCase(specialEvent)) {
            return new NewYearDiscountService();
        } else if ("Birthday".equalsIgnoreCase(specialEvent)) {
            return new BirthdayDiscountService();
        } else if ("Black Friday".equalsIgnoreCase(specialEvent)) {
            return new BlackFridayDiscountService();
        }
        return new DefaultDiscountService();
    }
}
