package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class Main {

    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        DiscountService discountService;
        discountService = discountStrategy.getDiscountServiceBySpecialEvent("New Year");
        System.out.println(discountService.getDiscount());
        discountService = discountStrategy.getDiscountServiceBySpecialEvent("Birthday");
        System.out.println(discountService.getDiscount());
        discountService = discountStrategy.getDiscountServiceBySpecialEvent("Black Friday");
        System.out.println(discountService.getDiscount());
        discountService = discountStrategy.getDiscountServiceBySpecialEvent("sdfdgf");
        System.out.println(discountService.getDiscount());

    }

}
