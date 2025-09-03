package core.basesyntax.strategy;

public class BirthdayDiscount implements DiscountService {
    @Override
    public double getDiscount() {
        return 33;
    }
}
