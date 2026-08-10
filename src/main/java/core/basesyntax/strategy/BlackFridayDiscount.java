package core.basesyntax.strategy;

public class BlackFridayDiscount implements DiscountService {
    @Override
    public double getDiscount() {
        return 45;
    }
}
