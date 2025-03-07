package core.basesyntax;
public class NewYearDiscountService implements DiscountService {
    public double calculateDiscount(int price, int price1) {
        return price1 * 0.20;
    }

    @Override
    public double getDiscount() {
        return 20;
    }
}
