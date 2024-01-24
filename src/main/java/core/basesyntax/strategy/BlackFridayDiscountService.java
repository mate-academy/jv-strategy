package core.basesyntax.strategy;

public class BlackFridayDiscountService implements DiscountService {
    private static final int BLACK_FRIDAY_DISCOUNT = 45;

    @Override
    public double getDiscount() {
        return (double) BLACK_FRIDAY_DISCOUNT;
    }
}
