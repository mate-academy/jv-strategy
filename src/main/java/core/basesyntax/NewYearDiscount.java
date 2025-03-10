package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscount implements DiscountService {

    @Override
    public double getDiscount() {
        return 20;
    }
}
