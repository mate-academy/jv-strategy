package core.basesyntax.strategy.implementations;

import core.basesyntax.strategy.DiscountService;

public class DefaultDiscountService implements DiscountService {
    @Override
    public int getDiscount() {
        return 0;
    }
}
