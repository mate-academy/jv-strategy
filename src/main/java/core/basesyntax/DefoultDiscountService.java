package core.basesyntax;

public class DefoultDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 0;
    }
}
