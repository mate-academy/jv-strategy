package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();

        String[] events = {"Birthday", "New Year", "Black Friday","Default event"};

        for (String event : events) {
            DiscountService discountService = discountStrategy
                    .getDiscountServiceBySpecialEvent(event);
            double discount = discountService.getDiscount();
            System.out.println("Event: " + event + ", Discount: " + discount + "%");
        }
    }
}
