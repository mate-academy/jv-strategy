package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class Main {
    public static void main(String[] args) {
        String event = "New Year";
        DiscountService discount = new DiscountStrategy().getDiscountServiceBySpecialEvent(event);

        System.out.printf("Event: '%s', Discount: %.1f\n", event, discount.getDiscount());
    }
}
