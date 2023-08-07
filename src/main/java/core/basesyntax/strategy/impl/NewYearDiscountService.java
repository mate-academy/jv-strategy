package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class NewYearDiscountService extends DefaultDiscountService implements DiscountService {
    public double getDiscount() {
        return (double)20;
    }
}
