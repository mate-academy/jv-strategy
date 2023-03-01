package core.basesyntax.strategy.impl;

public class BlackFridayDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 45.0;
    }
}
