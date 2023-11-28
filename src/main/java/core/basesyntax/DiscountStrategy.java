package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent.toLowerCase()) {
            case "birthday":
                return new BirthdayDiscountService();
            case "black friday":
                return new BlackFridayDiscountService();
            case "new year":
                return new NewYearDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }

    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        DiscountService discountService
                = discountStrategy.getDiscountServiceBySpecialEvent("Birthday");
        System.out.println("Discount for Birthday: " + discountService.getDiscount());

        discountService = discountStrategy.getDiscountServiceBySpecialEvent("New Year");
        System.out.println("Discount for New Year: " + discountService.getDiscount());

        discountService = discountStrategy.getDiscountServiceBySpecialEvent("Black Friday");
        System.out.println("Discount for Black Friday: " + discountService.getDiscount());

        discountService = discountStrategy.getDiscountServiceBySpecialEvent("Non-existent Event");
        System.out.println("Default Discount: " + discountService.getDiscount());
    }
}
