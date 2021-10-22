package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountServiceImpl;
import core.basesyntax.strategy.impl.BlackFridayDiscountServiceImpl;
import core.basesyntax.strategy.impl.DefaultDiscountServiceImpl;
import core.basesyntax.strategy.impl.NewYearDiscountServiceImpl;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
     switch (specialEvent) {
         case "Birthday" :
             return new BirthdayDiscountServiceImpl();
         case "New Year":
             return new NewYearDiscountServiceImpl();
         case "Black Friday":
             return new BlackFridayDiscountServiceImpl();
         default:
             return new DefaultDiscountServiceImpl();
     }
    }
}