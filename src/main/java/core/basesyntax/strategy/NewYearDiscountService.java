package core.basesyntax.strategy;

public class NewYearDiscountService implements DiscountService {
    private static final int NEW_YEAR_DISCOUNT = 20;

    @Override
    public double getDiscount() {
        return (double) NEW_YEAR_DISCOUNT;
    }
}
