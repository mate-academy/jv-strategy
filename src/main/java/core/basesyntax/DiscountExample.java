package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class DiscountExample {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();

        DiscountService birthdayService = discountStrategy
                .getDiscountServiceBySpecialEvent("Birthday");
        DiscountService blackFridayService = discountStrategy
                .getDiscountServiceBySpecialEvent("Black Friday");
        DiscountService newYearService = discountStrategy
                .getDiscountServiceBySpecialEvent("New Year");
        DiscountService defaultService = discountStrategy
                .getDiscountServiceBySpecialEvent("Regular Day");

        double birthdayDiscount = birthdayService.getDiscount();
        double blackFridayDiscount = blackFridayService.getDiscount();
        double newYearDiscount = newYearService.getDiscount();
        double defaultDiscount = defaultService.getDiscount();

        System.out.println("Birthday Discount: " + birthdayDiscount + "%");
        System.out.println("Black Friday Discount: " + blackFridayDiscount + "%");
        System.out.println("New Year Discount: " + newYearDiscount + "%");
        System.out.println("Default Discount: " + defaultDiscount + "%");
    }
}
