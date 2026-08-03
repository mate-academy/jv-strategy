import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.discount.BirthdayDiscountService;
import core.basesyntax.strategy.discount.BlackFridayDiscountService;
import core.basesyntax.strategy.discount.DefaultDiscountService;
import core.basesyntax.strategy.discount.NewYearDiscountService;

public class DiscountStrategy {

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        return switch (specialEvent) {
            case "Birthday" -> new BirthdayDiscountService();
            case "Black Friday" -> new BlackFridayDiscountService();
            case "New Year" -> new NewYearDiscountService();
            default -> new DefaultDiscountService();
        };
    }
}

