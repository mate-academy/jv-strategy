package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class HelloWorld {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();
        DiscountService service = strategy.getDiscountServiceBySpecialEvent("Birthday");
        double discount = service.getDiscount();
        System.out.println("Discount: " + (discount * 100) + "%");
    }

}
