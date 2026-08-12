package core.basesyntax;

public class BirthdayDiscountService implements DiscountService {
    public double calculateDiscount(int price, int price1) {
        return price1 * 0.33;
    }

    @Override
    public double getDiscount() {
        return 33;
    }
}
