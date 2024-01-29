package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public abstract class NewYearDiscountService implements DiscountService {
    public abstract double getDiscount();
}
