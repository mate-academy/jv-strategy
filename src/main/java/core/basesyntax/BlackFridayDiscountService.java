package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class BlackFridayDiscountService implements DiscountService {
    private static double DISCOUNT = 45;

    @Override
    public double getDiscount() {
        return DISCOUNT;
    }
}
