package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        String[] specialEvents = new String[] {"Birthday", "Black Friday", "New Year"};
        DiscountService discountService;

        for (String event : specialEvents) {
            discountService = discountStrategy.getDiscountServiceBySpecialEvent(event);
            System.out.println("Discount for '" + event + "' is: "
                    + discountService.getDiscount() + " %");
        }
    }
}
