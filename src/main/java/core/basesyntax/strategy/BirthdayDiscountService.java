package core.basesyntax.strategy;

public class BirthdayDiscountService implements DiscountService {
    private static final double DISCOUNT_PERCENT = 33.0;

    @Override
    public double getDiscount() {
        return DISCOUNT_PERCENT;
    }
}
