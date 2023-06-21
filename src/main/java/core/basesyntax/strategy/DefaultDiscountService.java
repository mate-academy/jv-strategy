package core.basesyntax.strategy;

public class DefaultDiscountService implements DiscountService {
    private static final double DEFAULT_DISCOUNT = 0.0;

    @Override
    public double getDiscount() {
        return DEFAULT_DISCOUNT;
    }
}
