package core.basesyntax.strategy;

public class NewYearDiscountService implements DiscountService {
    @Override
    public double getDiscount(double price) {
        return 20;
    }
}
