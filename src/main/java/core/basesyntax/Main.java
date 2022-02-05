package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();
        DiscountService service = strategy.getDiscountServiceBySpecialEvent("New Year");
        double result = service.getDiscount();
        System.out.println(result);
    }
}
