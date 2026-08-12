package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    private DiscountService discountService;

    public void setDiscountService(DiscountService discountService) {
        this.discountService = discountService;
    }

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Birthday":
                discountService = new BirthdayDiscountService();
                break;
            case "Black Friday":
                discountService = new BlackFridayDiscountService();
                break;
            case "New Year":
                discountService = new NewYearDiscountService();
                break;
            default:
                discountService = new DefaultDiscountService();
                break;
        }
        return discountService;
    }
}
