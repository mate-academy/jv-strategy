package core.basesyntax;

public class BirthdayDiscountService implements DiscountService {

    @Override
    public double getDiscount() {
        return (double) 33;
    }
}
