package core.basesyntax;

public class NewYearDiscount implements DiscountService {

    @Override
    public double getDiscount() {
        return 20;
    }
}
