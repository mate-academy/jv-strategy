package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();

        DiscountService blackFriday = strategy
                .getDiscountServiceBySpecialEvent("Black Friday");
        System.out.println("Black Friday discount: " + (blackFriday.getDiscount() * 100) + "%");

        DiscountService birthday = strategy
                .getDiscountServiceBySpecialEvent("Birthday");
        System.out.println("Birthday discount: " + (birthday.getDiscount() * 100) + "%");

        DiscountService newYear = strategy
                .getDiscountServiceBySpecialEvent("New Year");
        System.out.println("New Year discount: " + (newYear.getDiscount() * 100) + "%");

        DiscountService defaultService = strategy
                .getDiscountServiceBySpecialEvent("default");
        System.out.println("there is no discount: " + (defaultService.getDiscount() * 100) + "%");
    }
}
