package core.basesyntax;
import core.basesyntax.strategy.impl.*;
import core.basesyntax.strategy.DiscountService;


public class DiscountStrategy  {
    public static DiscountService getDiscountServiceBySpecialEvent(String specialEvent){
        return switch (specialEvent) {
            case "New Year" -> new NewYearDiscountService();
            case "Birthday" -> new BirthdayDiscountService();
            case "Black Friday" -> new BlackFridayDiscountService();
            default -> new DefaultDiscountService();
        };
    }
}
