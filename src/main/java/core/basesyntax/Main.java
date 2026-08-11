package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();
        DiscountService birthdayDiscountService = strategy
                .getDiscountServiceBySpecialEvent("Birthday");
        System.out.println(birthdayDiscountService.getDiscount());

        DiscountService blackFridayDiscountService = strategy
                .getDiscountServiceBySpecialEvent("Black Friday");
        System.out.println(blackFridayDiscountService.getDiscount());

        DiscountService newYearDiscountService = strategy
                .getDiscountServiceBySpecialEvent("New Year");
        System.out.println(newYearDiscountService.getDiscount());

        DiscountService defaultDiscountService = strategy
                .getDiscountServiceBySpecialEvent("DefaultDiscountService");
        System.out.println(defaultDiscountService.getDiscount());
    }
}
