package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;
import java.util.HashMap;
import java.util.Map;

public class DiscountStrategy {
    public static final String BIRTHDAY = "Birthday";
    public static final String BLACK = "Black Friday";
    public static final String NEW = "New Year";
    public static final String DEFAULT = "Default";

    DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        Map<String, DiscountService> mapOfDiscountServices = new HashMap<>();
        DiscountService birthdayDiscountService = new BirthdayDiscountService();
        DiscountService blackDiscountService = new BlackFridayDiscountService();
        DiscountService newDiscountService = new NewYearDiscountService();
        DiscountService defaultService = new DefaultDiscountService();
        mapOfDiscountServices.put(BIRTHDAY, birthdayDiscountService);
        mapOfDiscountServices.put(BLACK, blackDiscountService);
        mapOfDiscountServices.put(DEFAULT, defaultService);
        mapOfDiscountServices.put(NEW, newDiscountService);
        return mapOfDiscountServices.getOrDefault(specialEvent, defaultService);
    }
}
