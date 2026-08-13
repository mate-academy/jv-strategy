package core.basesyntax.strategy;

public class BirthdayDiscountService implements DiscountService {
    private static final double DEFAULT_DISCOUNT = 33.0;

    @Override
    public double getDiscount() {
        return DEFAULT_DISCOUNT;
    }
}
