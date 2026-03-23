package core.basesyntax.strategy.impl;

public class NewYearDiscountService extends DefaultDiscountService {
    @Override
    public double getDiscount() {
        return 20.0;
    }
}
