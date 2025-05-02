package core.basesyntax.strategy;

public class NewYearDiscountService implements DiscountService {

    @Override
    public double getDiscount() {
        return (double)20;
    }
}
