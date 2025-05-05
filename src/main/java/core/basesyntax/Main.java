package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class Main {
    public static void main(String[] args) {

        DiscountStrategy strategy = new DiscountStrategy();
        DiscountService newYearDiscountService =
                strategy.getDiscountServiceBySpecialEvent("New Year");
        double discount = newYearDiscountService.getDiscount();
        System.out.println("Discount for New Year: " + (discount) + "%");
    }
}
