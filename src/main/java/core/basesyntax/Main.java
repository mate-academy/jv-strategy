package core.basesyntax;

import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class Main {
    public static void main(String[] args) {
        System.out.println(new DefaultDiscountService().getDiscount());
        System.out.println(new NewYearDiscountService().getDiscount());
        System.out.println(new BirthdayDiscountService().getDiscount());
        System.out.println(new BlackFridayDiscountService().getDiscount());

        DiscountStrategy discountStrategy = new DiscountStrategy();
        System.out.println(discountStrategy.getDiscountServiceBySpecialEvent("New Year"));
    }
}
