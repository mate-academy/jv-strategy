package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class DiscountTerminal {
    public static void main(String[] args) {
        String SpecialEvent = "Birthday";

        DiscountStrategy discountStrategy = new DiscountStrategy();

        DiscountService discountService = discountStrategy.getDiscountServiceBySpecialEvent(SpecialEvent);

        double discount = discountService.getDiscount();

        System.out.println("Discount: " + discount + "%");
    }
}
