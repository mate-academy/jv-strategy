package core.basesyntax.strategy;

public class NewYearDiscountService implements DiscountService {
    public static final double NEW_YEAR_DISCOUNT = 20.0;

    @Override
    public double getDiscount() {
        return NEW_YEAR_DISCOUNT;
    }
}
