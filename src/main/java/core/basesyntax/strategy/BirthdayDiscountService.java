package core.basesyntax.strategy;

public class BirthdayDiscountService implements DiscountService {
    private static final double BIRTHDAY_DISCOUNT = 33.0;

    @Override
    public double getDiscount() {
        return BIRTHDAY_DISCOUNT;
    }
}
