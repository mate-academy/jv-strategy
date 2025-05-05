package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class HelloWorld {
    private static final String BLACK_FRIDAY_EVENT = "Black Friday";

    public static void main(String[] args) {
        DiscountService blackFridayService = new DiscountStrategy()
                .getDiscountServiceBySpecialEvent(BLACK_FRIDAY_EVENT);
        System.out.println("Discount for " + BLACK_FRIDAY_EVENT + ": "
                + blackFridayService.getDiscount() + "%");
    }

}
