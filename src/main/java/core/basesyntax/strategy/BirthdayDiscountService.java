package core.basesyntax.strategy;

public class BirthdayDiscountService implements DiscountService {

    @Override
    public double getDiscount() {
        return 33;
    }
}
