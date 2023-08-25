package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class Main {
    public static void main(String[] args) {

        DiscountStrategy strategy = new DiscountStrategy();
        DiscountService newYearDiscountService =
                strategy.getDiscountServiceBySpecialEvent("Black Friday");
        double discount = newYearDiscountService.getDiscount();
        System.out.println("Discount for Black Friday: " + (discount * 100) + "%");
    }
}
