package core.basesyntax;

public class DefaultDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 0;
    }
}
