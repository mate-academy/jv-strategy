package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class HelloWorld {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();

        DiscountService birthday = strategy.getDiscountServiceBySpecialEvent("Birthday");
        System.out.println("Birthday discount: " + birthday.getDiscount());

        DiscountService blackFriday = strategy.getDiscountServiceBySpecialEvent("Black Friday");
        System.out.println("Black Friday discount: " + blackFriday.getDiscount());

        DiscountService newYear = strategy.getDiscountServiceBySpecialEvent("New Year");
        System.out.println("New Year discount: " + newYear.getDiscount());

        DiscountService unknown = strategy.getDiscountServiceBySpecialEvent("SomeEvent");
        System.out.println("Unknown event discount: " + unknown.getDiscount());
    }
}
