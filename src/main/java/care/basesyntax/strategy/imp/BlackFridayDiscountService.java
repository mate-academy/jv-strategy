package care.basesyntax.strategy.imp;

import care.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    @Override
    public double getDiscount(double price) {
        return price * 0.45;
    }
}
