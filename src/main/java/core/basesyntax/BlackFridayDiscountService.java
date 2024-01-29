package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public abstract class BlackFridayDiscountService implements DiscountService {
    public abstract double getDiscount();
}
