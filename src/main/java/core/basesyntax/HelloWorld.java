package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        DiscountService discountService = new DefaultDiscountService();
        double defaultDiscount = discountService.getDiscount();
        System.out.println("Default discount: " + defaultDiscount);

        discountService = new BirthdayDiscountService();
        double birthdayDiscount = discountService.getDiscount();
        System.out.println("Birthday discount: " + birthdayDiscount);

        discountService = new NewYearDiscountService();
        double newYearDiscount = discountService.getDiscount();
        System.out.println("New Year discount: " + newYearDiscount);

        discountService = new BlackFridayDiscountService();
        double blackFridayDiscount = discountService.getDiscount();
        System.out.println("Black Friday discount: " + blackFridayDiscount);
    }
}
