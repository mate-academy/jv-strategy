package core.basesyntax.strategy.impl;

public class NewYearDiscountService extends BaseDiscountService {
    private static final double NEW_YEAR_DISCOUNT = 20;

    public NewYearDiscountService() {
        super("New Year");
    }

    @Override
    public double getDiscount() {
        return NEW_YEAR_DISCOUNT;
    }
}
