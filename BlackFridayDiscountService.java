package core.basesyntax.strategy.impl;
import core.basesyntax.strategy.DiscountService;
public class BlackFridayDiscountService implements DiscountService{
    public double getDiscount() {
        return 45.0;
    }
}
