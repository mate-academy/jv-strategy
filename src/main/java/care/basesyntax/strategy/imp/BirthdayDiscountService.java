package care.basesyntax.strategy.imp;

import care.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    @Override
    public double getDiscount(double price) {
        return price * 0.33;
    }
}
