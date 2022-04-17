package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy implements DiscountService, BirthdayDiscountService,
        BlackFridayDiscountService, NewYearDiscountService, DefaultDiscountService {
    private String specialEvent;

    @Override
    public double getDiscount() {
        return 0;
    }

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        this.specialEvent = specialEvent;

        if (specialEvent.equals("Birthday")) {
            return new DiscountService() {
                @Override
                public double getDiscount() {
                    return 33.0;
                }
            };
        } else if (specialEvent.equals("Black Friday")) {
            return new DiscountService() {
                @Override
                public double getDiscount() {
                    return 45.0;
                }
            };
        } else if (specialEvent.equals("New Year")) {
            return new DiscountService() {
                @Override
                public double getDiscount() {
                    return 20.0;
                }
            };
        } else {
            return new DiscountService() {
                @Override
                public double getDiscount() {
                    return 0.0;
                }
            };
        }
    }
}
