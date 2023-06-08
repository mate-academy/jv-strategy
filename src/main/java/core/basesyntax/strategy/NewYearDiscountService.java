package core.basesyntax.strategy;

public class NewYearDiscountService implements DiscountService {

    @Override
    public String toString() {
        return "20.0";
    }

    @Override
    public double getDiscount() {
        return (double) 20;
    }
}
