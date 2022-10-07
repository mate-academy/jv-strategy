package core.basesyntax;

public class DefaultDiscount implements DiscountService {
    @Override
    public double getDiscount() {
        return 0;
    }
}
