package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class Main {
    public static void main(String[] args) {
        String specialEvent = "Birthday";
        DiscountStrategy discountStrategy = new DiscountStrategy();
        DiscountService discountService = discountStrategy
                .getDiscountServiceBySpecialEvent(specialEvent);
        System.out.println(discountService.getDiscount());
    }
}
