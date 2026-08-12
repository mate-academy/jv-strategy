package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class DefoultDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 0;
    }
}
