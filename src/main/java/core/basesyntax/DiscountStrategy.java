package core.basesyntax;
import core.basesyntax.servise.DiscountService;
import core.basesyntax.servise.impl.BirthdayDiscountService;
import core.basesyntax.servise.impl.BlackFridayDiscountService;
import core.basesyntax.servise.impl.DefaultDiscountService;
import core.basesyntax.servise.impl.NewYearDiscountService;

public class DiscountStrategy {
    public static DiscountService getDiscountServiceBySpecialEvent(String specialEvent){
        return switch (specialEvent) {
            case "New Year" -> new NewYearDiscountService();
            case "Birthday" -> new BirthdayDiscountService();
            case "Black Friday" -> new BlackFridayDiscountService();
            default -> new DefaultDiscountService();
        };
    }
}
