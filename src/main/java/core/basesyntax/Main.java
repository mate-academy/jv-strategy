package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();
        DiscountService defaultDicountService = strategy
                .getDiscountServiceBySpecialEvent("nothing");
        DiscountService newYearDicountService = strategy
                .getDiscountServiceBySpecialEvent("New Year");
        DiscountService birthdayDicountService = strategy
                .getDiscountServiceBySpecialEvent("Birthday");
        DiscountService blackFridayDicsountService = strategy
                .getDiscountServiceBySpecialEvent("Black Friday");

    }
}
