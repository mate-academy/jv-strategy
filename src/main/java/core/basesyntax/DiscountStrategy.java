package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BaseDiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiscountStrategy {
    private final Map<String, DiscountService> discountMap = getFilledMap();

    private Map<String, DiscountService> getFilledMap() {
        Map<String, DiscountService> map = new HashMap<>();
        List<BaseDiscountService> services = List.of(
                new BirthdayDiscountService(),
                new BlackFridayDiscountService(),
                new NewYearDiscountService()
        );

        for (BaseDiscountService service : services) {
            map.put(service.getSpecialEvent(), service);
        }
        return map;
    }

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        return discountMap.getOrDefault(specialEvent, new DefaultDiscountService());
    }
}
