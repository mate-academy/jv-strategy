//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package core.basesyntax.strategy;

import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        if (specialEvent == null) {
            return new DefaultDiscountService();
        } else {
            switch (specialEvent) {
                case "Birthday" -> {
                    return new BirthdayDiscountService();
                }
                case "Black Friday" -> {
                    return new BlackFridayDiscountService();
                }
                case "New Year" -> {
                    return new NewYearDiscountService();
                }
                default -> {
                    return new DefaultDiscountService();
                }
            }
        }
    }
}
