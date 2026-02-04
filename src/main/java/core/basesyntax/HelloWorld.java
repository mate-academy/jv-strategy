package core.basesyntax;

import core.basesyntax.impl.DiscountStrategy;
import core.basesyntax.strategy.DiscountService;

public class HelloWorld {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        DiscountService newYear = discountStrategy.getDiscountServiceBySpecialEvent("New Year");
        System.out.println(newYear.getDiscount());
    }

}
