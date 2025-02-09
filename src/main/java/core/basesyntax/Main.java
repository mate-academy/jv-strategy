package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();

        String[] events = {"Birthday", "Black Friday", "New Year", "Unknown Event"};

        for (String event : events) {
            DiscountService discountService = discountStrategy.getDiscountServiceBySpecialEvent(event);
            System.out.println("Event: " + event + " -> Discount: " + discountService.getDiscount() + "%");
        }
    }
}
