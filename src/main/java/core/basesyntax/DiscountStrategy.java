package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {

    private DiscountService service;

    public DiscountService getService() {
        return service;
    }

    public void setService(DiscountService service) {
        this.service = service;
    }

    DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Birthday": {
                setService(new BirthdayDiscountService());
                break;
            }
            case "Black Friday": {
                setService(new BlackFridayDiscountService());
                break;
            }
            case "New Year": {
                setService(new NewYearDiscountService());
                break;
            }
            default:
                setService(new DefaultDiscountService());
        }
        return getService();
    }
}
