package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    private static final String BIRTHDAY = "Birthday";
    private static final String BLACK_FRIDAY = "Black Friday";
    private static final String NEW_YEAR = "New Year";
    private static final String DEFAULT = "";

    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        DiscountService birthdayDiscount =
                discountStrategy.getDiscountServiceBySpecialEvent(BIRTHDAY);
        DiscountService newYearDiscount =
                discountStrategy.getDiscountServiceBySpecialEvent(NEW_YEAR);
        DiscountService blackFridayDiscount =
                discountStrategy.getDiscountServiceBySpecialEvent(BLACK_FRIDAY);
        DiscountService defaultDiscount =
                discountStrategy.getDiscountServiceBySpecialEvent(DEFAULT);
        System.out.println(birthdayDiscount.getDiscount());
        System.out.println(newYearDiscount.getDiscount());
        System.out.println(blackFridayDiscount.getDiscount());
        System.out.println(defaultDiscount.getDiscount());
    }
}
