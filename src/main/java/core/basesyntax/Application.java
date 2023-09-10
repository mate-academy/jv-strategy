package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class Application {
    private static final DiscountStrategy STRATEGY = new DiscountStrategy();
    private static double DISCOUNT;
    private static final String SPECIAL_EVENT = "New Year";

    public static void main(String[] args) {
        DiscountService blackFridayService = STRATEGY
                .getDiscountServiceBySpecialEvent(SPECIAL_EVENT);
        DISCOUNT = blackFridayService.getDiscount();
        System.out.println("Congratulations! You have "
                + DISCOUNT
                + "%"
                + " off with our "
                + SPECIAL_EVENT
                + " discount!");
    }
}
