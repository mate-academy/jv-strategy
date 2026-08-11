package core.basesyntax.strategy;

public class DefaultDiscountService implements DiscountService {

    @Override
    public double getDiscount(double price) {
        return 0;
    }
}
