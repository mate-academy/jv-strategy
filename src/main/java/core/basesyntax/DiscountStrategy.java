package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

import java.util.HashMap;
import java.util.Map;

public class DiscountStrategy {
    private final Map<String, DiscountService> eventsDiscount;

    public DiscountStrategy() {
        eventsDiscount = new HashMap<>();
        eventsDiscount.put(EVENTS.BIRTHDAY.getEvent(), new BirthdayDiscountService());
        eventsDiscount.put(EVENTS.NEW_YEAR.getEvent(), new NewYearDiscountService());
        eventsDiscount.put(EVENTS.BLACK_FRIDAY.getEvent(), new BlackFridayDiscountService());
    }

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        return eventsDiscount.getOrDefault(specialEvent, new DefaultDiscountService());
    }

    enum EVENTS {
        BIRTHDAY {
            @Override
            public String getEvent() {
                return "Birthday";
            }
        },
        BLACK_FRIDAY {
            @Override
            public String getEvent() {
                return "Black Friday";
            }
        },
        NEW_YEAR {
            @Override
            public String getEvent() {
                return "New Year";
            }
        };

        public abstract String getEvent();
    }
}
