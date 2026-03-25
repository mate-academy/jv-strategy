package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.DiscountStrategy;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();
        DiscountService service = strategy
                .getDiscountServiceBySpecialEvent("BirthdayDiscountService");
        double discount = service.getDiscount();
        System.out.println(discount);
    }

}
