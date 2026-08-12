package core.basesyntax.strategy;

public class BlackFridayDiscountService implements DiscountService {

    @Override
    public String toString() {
        return "45.";
    }

    @Override
    public double getDiscount() {
        return (double) 45;
    }
}
