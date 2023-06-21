package core.basesyntax.strategy;

public class NewYearDiscountService implements DiscountService {
    private static final double DEFAULT_DISCOUNT = 20.0;

    @Override
    public double getDiscount() {
        return DEFAULT_DISCOUNT;
    }
}
