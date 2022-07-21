package core.basesyntax;

import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {

    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();
        DefaultDiscountService discountService =
                strategy.getDiscountServiceBySpecialEvent("Birthday");
        double discount = discountService.getDiscount(100);
        System.out.println(discount);
    }

    public DefaultDiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Birthday":
                return new BirthdayDiscountService();
            case "Black Friday":
                return new BlackFridayDiscountService();
            case "New Year":
                return new NewYearDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}
