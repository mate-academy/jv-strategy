package core.basesyntax.strategy;

public class BirthdayDiscountService implements DiscountService {

    @Override
    public String toString() {
        return "33.";
    }

    @Override
    public double getDiscount() {
        return (double) 33;
    }
}
