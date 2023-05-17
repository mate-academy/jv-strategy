package core.basesyntax;

public class NewYearDiscountService implements DiscountService {
    private static final double DISCOUNT = 20;

    @Override
    public double getDiscount() {
        return DISCOUNT;
    }
}
