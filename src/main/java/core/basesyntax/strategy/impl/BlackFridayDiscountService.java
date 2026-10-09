package core.basesyntax.strategy.impl;

public class BlackFridayDiscountService extends BaseDiscountService {
    private static final double BLACK_FRIDAY_DISCOUNT = 45;

    public BlackFridayDiscountService() {
        super("Black Friday");
    }

    @Override
    public double getDiscount() {
        return BLACK_FRIDAY_DISCOUNT;
    }
}
