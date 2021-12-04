package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.Implementation;

public class DiscountStrategy extends Implementation implements DiscountService {

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        return null;
    }
}
