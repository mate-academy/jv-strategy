package core.basesyntax.strategy;

public class BlackFridayDiscountService implements DiscountService {
    private static final double DEFAULT_DISCOUNT = 45.0;

    @Override
    public double getDiscount() {
        return DEFAULT_DISCOUNT;
    }
}
