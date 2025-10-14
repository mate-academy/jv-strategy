package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class DiscountStrategy implements DiscountService {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Birthday":
                return new BirthdayDiscountService();
            case "New Year":
                return new NewYearDiscountService();
            case "Black Friday":
                return new BlackFridayDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }

    @Override
    public double getDiscount() {
        return 0;
    }
}
