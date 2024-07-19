package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();

        DiscountService blackFridayService
                = strategy.getDiscountServiceBySpecialEvent("Black Friday");
        System.out.println("Black Friday: " + blackFridayService.getDiscount());

        DiscountService birthdayService
                = strategy.getDiscountServiceBySpecialEvent("Birthday");
        System.out.println("Birthday Discount: " + birthdayService.getDiscount());

        DiscountService newYearService
                = strategy.getDiscountServiceBySpecialEvent("New Year");
        System.out.println("New Year Discount: " + newYearService.getDiscount());

        DiscountService defaultService
                = strategy.getDiscountServiceBySpecialEvent("Default event");
        System.out.println("Default Discount: " + defaultService.getDiscount());

    }

}
