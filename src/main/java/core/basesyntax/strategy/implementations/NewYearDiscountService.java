package core.basesyntax.strategy.implementations;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService implements DiscountService {
    @Override
    public int getDiscount() {
        return 20;
    }
}
