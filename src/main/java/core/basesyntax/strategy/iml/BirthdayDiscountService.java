package core.basesyntax.strategy.iml;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    @Override
    public double getDiscount(int price) {
        return price * 0.33;
    }
}
