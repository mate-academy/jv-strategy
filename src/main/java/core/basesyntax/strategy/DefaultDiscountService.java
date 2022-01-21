package core.basesyntax.strategy;

public class DefaultDiscountService implements DiscountService {
    private static final double DISCOUNT_PERCENT = 0.0;

    @Override
    public double getDiscount() {
        return DISCOUNT_PERCENT;
    }
}
