package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.Discounts;

public class DiscountStrategy extends Discounts {
    private DefaultDiscountServise defaultDiscount = new DefaultDiscountServise();
    private BirthdayDiscountService birthday = new BirthdayDiscountService();
    private NewYearDiscountService newYear = new NewYearDiscountService();
    private BlackFridayDiscountService blackFriday = new BlackFridayDiscountService();

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        if (specialEvent.equals("Birthday")) {
            return birthday;
        }
        if (specialEvent.equals("New Year")) {
            return newYear;
        }
        if (specialEvent.equals("Black Friday")) {
            return blackFriday;
        }
        return defaultDiscount;
    }
}
