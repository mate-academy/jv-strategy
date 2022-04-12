package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();
        DiscountService service = strategy
                .getDiscountServiceBySpecialEvent("BlackFridayDiscountService");
        double discount = service.getDiscount();

    }

}
