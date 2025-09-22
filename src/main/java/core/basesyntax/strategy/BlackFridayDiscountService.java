package core.basesyntax.strategy;

public class BlackFridayDiscountService implements DiscountService {
    @Override
    public double getDiscount(double price) {
        return 45;
    }
}
