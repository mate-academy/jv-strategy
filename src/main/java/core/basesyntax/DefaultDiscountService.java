package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public abstract class DefaultDiscountService implements DiscountService {
    public abstract double getDiscount();
}
