package core.basesyntax.strategy.impl;

public class BirthdayDiscountService extends BaseDiscountService {
    private static final double BIRTHDAY_DISCOUNT = 33;

    public BirthdayDiscountService() {
        super("Birthday");
    }

    @Override
    public double getDiscount() {
        return BIRTHDAY_DISCOUNT;
    }
}
