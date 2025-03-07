package core.basesyntax;

public class DefaultDiscountService implements DiscountService {
    public double calculateDiscount(int price, int price1) {
        return price1 * 0.0;
    }


    @Override
    public double getDiscount() {
        return 0;
    }
}
