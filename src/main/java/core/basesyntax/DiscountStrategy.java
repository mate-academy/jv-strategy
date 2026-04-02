package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        //"Birthday", "Black Friday", "New Year".
        switch (specialEvent) {
            case "Birthday":
                return new BirthdayDiscountService();
            case "Black Friday":
                return new BlackFridayDiscountService();
            case "New Year":
                return new NewYearDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }

    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        DiscountService discountService = discountStrategy
                .getDiscountServiceBySpecialEvent("Birthday");
        System.out.println(discountService.getDiscount());
        DiscountService discountService1 = discountStrategy
                .getDiscountServiceBySpecialEvent("Black Friday");
        System.out.println(discountService1.getDiscount());
        DiscountService discountService2 = discountStrategy
                .getDiscountServiceBySpecialEvent("New Year");
        System.out.println(discountService2.getDiscount());
    }
}
