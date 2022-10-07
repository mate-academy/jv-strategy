package core.basesyntax;

public class BirthdayDiscount implements DiscountService {
    @Override
    public double getDiscount() {
        return 33;
    }
}
