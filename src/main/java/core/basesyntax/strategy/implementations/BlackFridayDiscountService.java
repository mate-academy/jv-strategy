package core.basesyntax.strategy.implementations;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    @Override
    public int getDiscount() {
        return 45;
    }
}
