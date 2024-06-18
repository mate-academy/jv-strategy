package care.basesyntax.strategy.imp;

import care.basesyntax.strategy.DiscountService;

public class DefaultDiscountService implements DiscountService {
    @Override
    public double getDiscount(double price) {
        return 0;
    }
}
