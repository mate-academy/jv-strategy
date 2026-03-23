package core.basesyntax.strategy.impl;

public class BlackFridayDiscountService extends DefaultDiscountService {
    @Override
    public double getDiscount() {
        return 45.0;
    }
}
