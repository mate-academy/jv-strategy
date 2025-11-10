package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    public BirthdayDiscountService() {
    }

    @Override
    public double getDiscount() {
        return 33;
    }

}
