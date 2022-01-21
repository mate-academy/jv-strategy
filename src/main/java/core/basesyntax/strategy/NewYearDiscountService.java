package core.basesyntax.strategy;

public class NewYearDiscountService implements DiscountService {
    private static final double DISCOUNT_PERCENT = 20.0;

    @Override
    public double getDiscount() {
        return DISCOUNT_PERCENT;
    }
}
