package core.basesyntax;

public class BlackFridayDiscountService implements DiscountService {
    private static final double DISCOUNT = 45;

    @Override
    public double getDiscount() {
        return DISCOUNT;
    }
}
