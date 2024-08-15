package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

/**
 * Feel free to remove this class and create your own.
 */
public class DiscountStrategy {
    private static void getTest() {
        System.out.println("test");
        //This void was added only for my and to let me send pull request cuz iv made a mistake and made this quest on master branch
    }

    DiscountService getDiscountServiceBySpecialEvent(String specialEcent) {
        return switch (specialEcent) {
            case "Birthday" -> new BirthdayDiscountService();
            case "Black Friday" -> new BlackFridayDiscountService();
            case "New Year" -> new NewYearDiscountService();
            default -> new DefaultDiscountService();
        };

    }
}

