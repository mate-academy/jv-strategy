package core.basesyntax.strategy;

public class DefaultDiscountService implements DiscountService {
    private static final int DEFAULT_DISCOUNT = 0;

    @Override
    public double getDiscount() {
        return (double) DEFAULT_DISCOUNT;
    }
}
