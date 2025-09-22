package core.basesyntax.strategy;

public class BirthdayDiscountService implements DiscountService {
    @Override
    public double getDiscount(double price) {
        return 33;
    }
}
