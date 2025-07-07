package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class HelloWorld {
    public static void main(String[] args) {

        DiscountStrategy discount = new DiscountStrategy();
        DiscountService discountService = discount.getDiscountServiceBySpecialEvent("Black Friday");
        double salary = discountService.getDiscount();
        System.out.println(salary);

    }
}
