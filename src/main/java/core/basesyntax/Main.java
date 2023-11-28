package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        String specialEvent = "Birthday";
        DiscountService discountService = discountStrategy
                .getDiscountServiceBySpecialEvent(specialEvent);
        double discount = discountService.getDiscount();
        System.out.println("Discount for " + specialEvent + ": " + discount + "%");
    }
}
