package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class Main {
    public static void main(String[] args) {
        //String ivent = "New Year";
        String ivent = "jvj,,";

        DiscountStrategy discountStrategy = new DiscountStrategy();
        DiscountService discountService = discountStrategy.getDiscountServiceBySpecialEvent(ivent);
        double discount = discountService.getDiscount();
        System.out.println("Your discount today " + discount + "%");
    }
}
