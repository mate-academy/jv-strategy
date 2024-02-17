package core.basesyntax;

import core.basesyntax.impl.BirthdayDiscountService;
import core.basesyntax.impl.BlackFridayDiscountService;
import core.basesyntax.impl.DefaultDiscountService;
import core.basesyntax.impl.NewYearDiscountService;
import java.util.HashMap;

public class DiscountStrategy {
    private HashMap<String, DiscountService> stringDiscountService = new HashMap<>();
    private BirthdayDiscountService birthdayDiscount = new BirthdayDiscountService();
    private BlackFridayDiscountService blackFridayDiscount = new BlackFridayDiscountService();
    private NewYearDiscountService newYearDiscount = new NewYearDiscountService();
    private DefaultDiscountService defaultDiscount = new DefaultDiscountService();

    DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        stringDiscountService.put("Birthday", birthdayDiscount);
        stringDiscountService.put("Black Friday", blackFridayDiscount);
        stringDiscountService.put("New Year", newYearDiscount);
        if (stringDiscountService.get(specialEvent) != null) {
            return stringDiscountService.get(specialEvent);
        }
        return defaultDiscount;
    }
}
