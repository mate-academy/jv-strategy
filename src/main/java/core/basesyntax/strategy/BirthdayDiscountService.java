package core.basesyntax.strategy;

public class BirthdayDiscountService implements DiscountService {
    private static final int BIRTHDAY_DISCOUNT = 33;

    @Override
    public double getDiscount() {
        return (double) BIRTHDAY_DISCOUNT;
    }
}
