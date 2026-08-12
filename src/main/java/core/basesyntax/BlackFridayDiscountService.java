package core.basesyntax;

public class BlackFridayDiscountService implements DiscountService {

    public double calculateDiscount(int price, int price1) {
        return price1 * 0.45;
    }

    @Override
    public double getDiscount() {
        return 45;
    }
}
