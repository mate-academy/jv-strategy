package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.imp.BirthdayDiscountServiceImpl;
import core.basesyntax.strategy.imp.BlackFridayDiscountServiceImpl;
import core.basesyntax.strategy.imp.DefaultDiscountServiceImpl;
import core.basesyntax.strategy.imp.NewYearDiscountServiceImpl;
import java.util.HashMap;
import java.util.Map;

public class DiscountStrategy {
    private Map<String, DiscountService> map = new HashMap<>();
    private DiscountService newYear = new NewYearDiscountServiceImpl();
    private DiscountService birthday = new BirthdayDiscountServiceImpl();
    private DiscountService defaultEvent = new DefaultDiscountServiceImpl();
    private DiscountService blackFriday = new BlackFridayDiscountServiceImpl();

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        map.put("Birthday", birthday);
        map.put("Black Friday", blackFriday);
        map.put("New Year", newYear);
        map.put("Default event", defaultEvent);
        return map.get(specialEvent);
    }
}
