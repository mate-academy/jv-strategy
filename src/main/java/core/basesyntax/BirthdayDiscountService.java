package core.basesyntax;

public class BirthdayDiscountService implements DiscountService {
    private static final double DISCOUNT = 33;

    @Override
    public double getDiscount() {
        return DISCOUNT;
    }
}
