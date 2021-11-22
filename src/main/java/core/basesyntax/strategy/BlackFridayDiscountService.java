package core.basesyntax.strategy;

public class BlackFridayDiscountService implements DiscountService {
    private static final double BLACK_FRIDAY_DISCOUNT = 45.0;

    @Override
    public double getDiscount() {
        return BLACK_FRIDAY_DISCOUNT;
    }
}
