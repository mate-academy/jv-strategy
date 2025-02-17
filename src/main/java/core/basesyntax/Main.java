package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();

        DiscountService discountService = discountStrategy.getDiscountServiceBySpecialEvent("New Year");
        System.out.println("New Year Discount: " + discountService.getDiscount() + "%");

        discountService = discountStrategy.getDiscountServiceBySpecialEvent("Birthday");
        System.out.println("Birthday Discount: " + discountService.getDiscount() + "%");

        discountService = discountStrategy.getDiscountServiceBySpecialEvent("Black Friday");
        System.out.println("Black Friday Discount: " + discountService.getDiscount() + "%");

        discountService = discountStrategy.getDiscountServiceBySpecialEvent("Holiday");
        System.out.println("Holiday Discount (Default): " + discountService.getDiscount() + "%");
    }
}
