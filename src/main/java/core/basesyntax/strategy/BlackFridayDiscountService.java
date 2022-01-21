package core.basesyntax.strategy;

public class BlackFridayDiscountService implements DiscountService {
    private static final double DISCOUNT_PERCENT = 45.0;

    @Override
    public double getDiscount() {
        return DISCOUNT_PERCENT;
    }
}
