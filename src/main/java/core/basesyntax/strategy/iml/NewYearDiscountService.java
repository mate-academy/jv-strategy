package core.basesyntax.strategy.iml;

import core.basesyntax.DiscountService;

public class NewYearDiscountService implements DiscountService {

    @Override
    public double getDiscount() {
        return (double) 20;
    }
}
