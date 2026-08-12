package core.basesyntax.strategy;

public class DefaultDiscountService implements DiscountService {
    @Override
    public String toString() {
        return "0.0";
    }

    @Override
    public double getDiscount() {
        return (double) 0;
    }

}
